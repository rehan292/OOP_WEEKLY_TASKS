import instagramlab.HashtagTren;
import instagramlab.InstaAccount;

public class Main {
    public static void main(String[] args) {

        InstaAccount account1 = new InstaAccount("@sara.cs", "sara", "hey i am sara ", new int[] { 20, 30, 40 });
        account1.displayDetails();

        InstaAccount account2 = new InstaAccount("@areeba.cs", "areeba", "hey i am areeba", new int[] { 40, 50, 60 });
        account2.displayDetails();

        account1.setBio("coding daily");
        account1.updatePostLikes(4, 90);

        System.out.println("Total accounts created: " + InstaAccount.getAccountCount());

        HashtagTren trend = new HashtagTren("H-01", "#CampusLife");
        trend.recordUse();

        trend.displayTrend();

    }
}