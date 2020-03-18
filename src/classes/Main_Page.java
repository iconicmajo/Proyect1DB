package classes;

public class Main_Page{

    private String consult;
    private boolean [] privileges;
    
    public Main_Page(String consult, int[] permissions){
        this.consult = consult;
        privileges = new boolean[]{false, false, false, false, false, false};
        stablishPermissions(permissions);
    }

    private void stablishPermissions(int[] permission){
        for(int permissionPosition : permission){
            this.privileges[permissionPosition - 1] = true;
        }
    }
}