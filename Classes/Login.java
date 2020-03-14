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
     private bool isAdministrator(String userName, int id){
        String administrator = "QUERY"
         //TODO: userName split into id and name
         //Query
         return true;
     }

     /**
      * @param userName
      * @param id
      * @return True of False wheter a user is registered or not
      */
     private bool isUser(String userName, int id){
         String user = "Query";

         return true;
     }


     /**
      * Is in charge of Loging in the user
      */
     public void doLogIn(){
        String id_UserName = this.userName.split("_");
        String userName = id_UserName[0];
        int id = id_UserName[1];

         String isAdministrator = isAdministrator(userName, id);
         String isUser = isUser(userName, id);

         if(isAdministrator){
             startSession(isAdministrator);
             //TODO: ENTER WITH ADMINISTRATOR PRIVILEGES
         }else if(isUser){
             getUserRoles(id, userName)
         }else{
             //TODO: Return bad credentials message 
         }
     }


     /**
      * Gets a list of permissions associated with a specific user
      */
     private void getUserPermissions(){
         String query = "Devuelve un listado de permisos";
         startSession(f);
     }

     /**
      * Starts up a new session as Admin
      * @param isAdministrator
      */
     private void startSession(boolean isAdministrator){
         //TODO START SESSION IF IS A ADMIN

     }


     /**
      * Starts up a new session as a common user or a user with defined permitions
      * @param permissions
      */
     private void startSession(String [] permissions){
         if(permissions.length == 0){
             //TODO: Common user log in
         }else{
             //TODO: User with permitions log in
         }
     }

}