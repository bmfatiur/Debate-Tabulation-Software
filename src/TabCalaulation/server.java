
package TabCalaulation;

public class server{
    
    protected addAdjudicator add_Adjudicator = new addAdjudicator();
    protected addTeam add_Team = new addTeam();
    protected addVenue add_Venue = new addVenue();
    protected adminPage admin_Page = new adminPage();
    protected checkin Checkin = new checkin();
    protected loginPage login_Page = new loginPage();
    protected titlePage title_Page = new titlePage();
    protected tournament Tournament = new tournament();
    
    //Tournament data
    private String Tournament_name, Tournament_user, Tournament_pass;
    private Integer Tournament_round, Tournament_break;
    //Tournament data
    
    
    public tournament getTournament(){return Tournament;}
    public void setTournament(tournament tour){
    
        Tournament_name = tour.tournament_tname.getText().toString();
        String number = tour.tournament_roundNumber.getText().toString();
        Tournament_round = Integer.parseInt(number);
        Tournament_break = 8;
        Tournament_user = tour.tournament_adminUsername.getText().toString();
        Tournament_pass = tour.tournament_adminPass.getText().toString();
    }
    public titlePage getTitlePage(){return title_Page;}
    public void setTitlePage(titlePage title){title_Page=title;}
    
    //adminPage
    public adminPage getAdminPage(){return admin_Page;}
    public void getAdminPage(adminPage page){admin_Page = page;}
    //adminPage
    
    //
    
    public server(){
    
        
        //title_Page.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        
    }
    
}
