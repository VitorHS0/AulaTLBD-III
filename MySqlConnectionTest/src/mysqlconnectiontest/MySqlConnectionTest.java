package mysqlconnectiontest;

public class MySqlConnectionTest {

    public static void main(String[] args)throws Exception{
        System.out.println(JdbcUtil.getConnection());
        AlunoDAO alunodao = new AlunoDAO(JdbcUtil.getConnection());
        alunodao.insere((new Aluno("Vitor")),"1");
        alunodao.insere((new Aluno("Henrique")),"2");
        alunodao.insere((new Aluno("Caio")),"3");
        alunodao.update("João", "3");
        
        
        
        //alunodao.update();
    }
    
}
