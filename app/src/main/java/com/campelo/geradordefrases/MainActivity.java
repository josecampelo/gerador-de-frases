package com.campelo.geradordefrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frasesAleatorias = {
            "O sol brilha forte.",
            "Chuva cai lá fora.",
            "Amigos são essenciais.",
            "A vida tem altos.",
            "Tempo cura feridas.",
            "Rir é melhor remédio.",
            "Sonhos se realizam.",
            "Amar traz alegria.",
            "Sempre siga em frente.",
            "Paz traz felicidade.",
            "Explore novos horizontes.",
            "Aceite-se como é.",
            "Família é apoio.",
            "O amor é poderoso.",
            "Esforce-se ao máximo.",
            "O mundo é vasto.",
            "Aprenda com erros.",
            "Seja gentil sempre.",
            "Sorria para desconhecidos.",
            "Foco leva ao sucesso.",
            "O futuro é incerto.",
            "Coragem vence medos.",
            "Seja a luz.",
            "Paixão gera realização.",
            "Aja com bondade.",
            "Crie memórias preciosas.",
            "Ame sem medidas.",
            "Supere desafios constantemente.",
            "Aprenda com experiências.",
            "Seja a mudança.",
            "O tempo revela tudo.",
            "Cultive amizades verdadeiras.",
            "O esforço compensa.",
            "Espalhe boas energias.",
            "Nunca desista dos sonhos.",
            "Oportunidades surgem inesperadamente.",
            "Ria dos problemas.",
            "Ame a jornada.",
            "Aja com compaixão.",
            "Vença com determinação.",
            "Sorria para adversidades.",
            "Inspire outros positivamente.",
            "Seja grato sempre.",
            "Acredite em si mesmo.",
            "Respeite para ser respeitado.",
            "Compartilhe o conhecimento.",
            "Abraçar é reconfortante.",
            "Viva intensamente cada dia.",
            "O amor transforma vidas.",
            "Persista além das dificuldades.",
            "Seja gentil consigo.",
            "O respeito é essencial.",
            "Explore sua criatividade.",
            "Encare com otimismo.",
            "Aceite desafios com coragem.",
            "Seja a inspiração.",
            "Liberte sua imaginação.",
            "Busque equilíbrio interior.",
            "Celebre as pequenas vitórias.",
            "Ame sem restrições.",
            "Enfrente com confiança.",
            "Crie seu próprio destino.",
            "Aprenda de coração aberto.",
            "Conecte-se com a natureza.",
            "Espalhe amor sempre.",
            "Aja com gentileza.",
            "Abra portas com educação.",
            "Transforme sonhos em realidade.",
            "Aceite, mas não desista.",
            "Supere, cresça, evolua.",
            "Seja a mudança positiva.",
            "Compartilhe sorrisos generosos.",
            "Abrace oportunidades únicas.",
            "Força vem de dentro.",
            "Construa pontes de entendimento.",
            "Inspire-se na jornada.",
            "Acredite na sua capacidade.",
            "Comemore cada conquista.",
            "O conhecimento enriquece.",
            "Viva com autenticidade.",
            "Encante com suas ações.",
            "Sempre siga em frente.",
            "Cultive amizades duradouras.",
            "Liberte sua verdade interior.",
            "Transforme dificuldades em aprendizado.",
            "Ame sem esperar retorno.",
            "Encare medos de frente.",
            "Conquiste com determinação.",
            "Sorria para o desconhecido.",
            "Inspiração gera inovação.",
            "Seja luz na escuridão.",
            "Aja com sabedoria amorosa.",
            "Celebre sua singularidade.",
            "Enfrente com resiliência.",
            "Ame a jornada, não só o destino.",
            "Sonhe, acredite, conquiste.",
            "Abraços aquecem a alma.",
            "Sorria, contagie alegria.",
            "Supere, adapte, vença.",
            "Ame sem julgamentos."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView fraseAleatoria = findViewById(R.id.txtFraseAleatoria);
        int i = new Random().nextInt(frasesAleatorias.length);

        fraseAleatoria.setText(frasesAleatorias[i]);
    }
}