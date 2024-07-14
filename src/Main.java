import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Excel");
        curso2.setDescricao("Descrição curso Excel");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("mentoria Java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev felipeDev = new Dev();
        felipeDev.setNome("Felipe");
        felipeDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + felipeDev.getConteudosInscritos());
        felipeDev.progredir();
        felipeDev.progredir();
        System.out.println("Conteudos Inscritos" + felipeDev.getConteudosInscritos());
        System.out.println("conteudos Concluidos: " + felipeDev.getConteudosConcluidos());
        System.out.println("XP: " + felipeDev.calcularTotalXp());


        Dev andreDev = new Dev();
        andreDev.setNome("Andre");
        andreDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + andreDev.getConteudosInscritos());
        andreDev.progredir();
        andreDev.progredir();
        andreDev.progredir();
        System.out.println("Conteudos Inscritos" + andreDev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + andreDev.getConteudosConcluidos());
        System.out.println("XP: " + andreDev.calcularTotalXp());






    }
}