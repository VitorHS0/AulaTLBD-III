package mysqlconnectiontest;
import java.sql.*;

public class AlunoDAO {
    
    private Connection conn;
    public AlunoDAO(Connection c){
        this.conn = c;
    }
    
    public void insere(Aluno a,String id) throws SQLException{
        try {
        String sql = "insert into Aluno(id,Nome) values('"+id+"','"+a.getNome()+"');";
        PreparedStatement ps = this.conn.prepareStatement(sql); 
        ps.executeUpdate();
        ps.close();
        }
        catch(Exception ex){System.out.println(ex);}
        
    }
    
     public void update (String novo, String id) throws SQLException {
    PreparedStatement ps = this.conn.prepareStatement("UPDATE aluno SET nome = '"+novo+"' WHERE id = '"+id+"'");
    ps.executeUpdate();
    ps.close();
    
    }
    
}
