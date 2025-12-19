import hospitality.gui.LoginFrame;
public class HospitalityAssistantManagementSystem {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}

