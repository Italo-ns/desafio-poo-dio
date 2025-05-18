
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargahoraria(8);
    
    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargahoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);


    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Devoleper");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());

    devCamila.progredir();
    devCamila.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
    System.out.println("XP:" + devCamila.calcularTotalXp());

    System.out.println("-----------------------");

    Dev devjoao = new Dev();
    devjoao.setNome("joão");
    devjoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos João:" + devjoao.getConteudosInscritos());

    devjoao.progredir();
    devjoao.progredir();
    devjoao.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos João:" + devjoao.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos João:" + devjoao.getConteudosConcluidos());
    System.out.println("XP:" + devjoao.calcularTotalXp());


    }
}
