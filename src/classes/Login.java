package classes;

public class Login{

    private String userName;
    private String password;

    public Login(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    /**
     * Types of users: 
     * a) Admnistrator (superUser)
     * b) Common User
     * 
     * Permissions:
     * Register Artist
     * Register Album
     * Register Songs
     * Unactivate a Song
     * Modify Information
     * Elimination
     * 
     * Roles:
     * Administrator creates these mixing differente Permissions
     */


     /**
      * @param userName
      * @param id
      * @return True or false wheter a user is admin or not
      */
     private boolean isAdministrator(String userName, int id){
        String administrator = "QUERY";
         //TODO: userName split into id and name
         //Query
         return true;
     }

     /**
      * @param userName
      * @param id
      * @return True of False wheter a user is registered or not
      */
     private boolean isUser(String userName, int id){
         String user = "Query";

         return true;
     }


     /**
      * Is in charge of Loging in the user
      */
     public void doLogIn(){
        String[] userName_ID= this.userName.split("_");
        String userName = userName_ID[0];
        int id = Integer.parseInt(userName_ID[1]);

         boolean isAdministrator = isAdministrator(userName, id);
         if(isAdministrator){
            startSession();
            //TODO: ENTER WITH ADMINISTRATOR PRIVILEGES
         }

         boolean isUser = isUser(userName, id);
         if(isUser){
             getUserPermissions(id, userName);
         }else{
             //TODO: Return bad credentials message 
         }
     }


     /**
      * Gets a list of permissions associated with a specific user
      */
     private void getUserPermissions(int id, String userName){
         String query = "Devuelve un listado de permisos";
         startSession();
     }

     /**
      * Starts up a new session as Admin
      */
     private void startSession(){
         //TODO START SESSION IF IS A ADMIN
     }


     /**
      * Starts up a new session as a common user or a user with defined permitions
      * @param permissions
      */
     private void startSession(int [] permissions){
         if(permissions.length == 0){
             //TODO: Common user log in
         }else{
             //TODO: User with permitions log in
             
         }
     }

}