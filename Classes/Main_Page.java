public class Main_Page(){

    private String consult;
    private boolean [] privileges;
    
    public Main_Page(String consult, int[] permissions){
        this.consult = consult;
        privileges = new boolean[]{false, false, false, false, false, false};
        stablishPermissions(permission);
    }

    private void stablishPermissions(int[] permission){
        for(int permission : permission){
            this.privileges[permission - 1] = true;
        }
    }
}