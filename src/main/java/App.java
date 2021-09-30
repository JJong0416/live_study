import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;

public class App {
    private final String token = "personal_github_token";
    private GitHub github;

    public static void main(String[] args) throws IOException {
        App app = new App();

        app.run();
    }

    private void run() throws IOException{
        connectGitApi();
        GHRepository ghRepository = github.getRepository("whiteship/live-study");

        /* 참가자 이름, 참여 횟수 */
        Map<String, Integer> participant = new HashMap<>();

        /* 이슈 가져오기 */
        List<GHIssue> issues = ghRepository.getIssues(GHIssueState.ALL);

        /* 이슈 찾기 */
        for (GHIssue issue : issues){
            List<GHIssueComment> commentList = issue.getComments();

            // 중복제거를 위한 list
            Set<String> checkList = new HashSet<>();

            // 참가자 중복 체크
            for (GHIssueComment ghIssueComment : commentList) {
                checkList.add(ghIssueComment.getUser().getLogin());
            }

            for (String s : checkList){
                if (!participant.containsKey(s)){
                    participant.put(s,1);
                } else {
                    Integer integer = participant.get(s);
                    participant.put(s, ++integer);
                }
            }
        }
    }

    private void connectGitApi() throws IOException {
        github = new GitHubBuilder().withOAuthToken(token).build();
    }
}
