public class Principal{

    public static void main (String args[]){

    Funcionario f=new Funcionario();
    f.setNome("Kauê");
    f.setCpf("123.456.789-10");
    f.setDepartamento("T.I");
    f.setSalario(5600);

    System.out.println("O nome do funcionário é "+f.getNome());
    System.out.println("CPF do Funcionário: "+f.getCpf());
    System.out.println("Pertence ao deartamento de "+f.getDepartamento());
    System.out.println("Recebendo um salário no valor de "+f.getSalario());
    System.out.println("E tera um bonificação de: "+f.bonificacao());
    }
}