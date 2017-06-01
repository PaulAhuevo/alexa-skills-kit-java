package punchlines;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.slu.Slot;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SimpleCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Punchlines {

    private static List<String> punchlinesFarid = Arrays.asList(
            "Der einzige Ring, den ich einer Frau gebe, traegt sie am Auge.",
            "Und ich knalle im Bordell deine Mama, sie kriegt ne Ladung hinten rein, wie LKW-Fahrer",
            "Wo du kurz vor deiner Geburt warst, ist jetzt mein Schwanz",
            "Ich bin ein Romantiker, wie Buchverkauefer",
            "Wenn ein Türsteher sagt ich passe nicht rein, dann sag ich du hast Recht, denn ich trainier auf Masse zur Zeit.",
            "Rapper reden von Gangstern, die sie mit Waffen beschuetzen, sie sind keine Taucher, doch haben nur Flaschen im Ruecken",
            "Die Frauen heute wollen Jungfrau bleiben. Zwei Optionen, Arsch oder Mund auf, Kleines.",
            "Deine Mutter ist wie ne Shisha, ohne Kohle geht nix."
    );

    private static List<String> punchlinesKollegah = Arrays.asList(
            "Und dann gehen wir mal deine Mum, die Crackschlampe holen. Diese Drecksschlampe wuerd' ich nicht von der Bettkante stoßen, Sondern ihren Kopf auf die Bettkante stoßen und die ohnmaechtige Bitch dann uebergebeugt über die Bettkante stossen",
            "Ich spann den Lat an bei Sonnenuntergaengen, während selbst an Nonnenklosterwaenden - Kolle-Poster haengen",
            "Ihr macht auf Jungs von der Straße, Aber singt bei den Grünen, wie die Umfragezahlen zu Bundestagswahlen",
            "Der Boss ist wie Viagra, man kann denken was man will, doch das Ding ist erregiert",
            "Kuck ich hab in Sizilien Kartelle, Du nur mehr nackte Typen unter der Decke als die Sixtinische Kapelle.",
            "Fängt zu Saufen an um zehn und will erstmal ein Glas um die Uhrzeit exen, wie im Dinosauriermuseum",
            "Deine Freundin ist wie frische Produkte im Supermarkt, man sollte sie besser von hinten nehmen.",
            "Guck, ich komm mit Coke in der Limo, so wie Mezzo Mix."
    );


    private static List<String> punchlinesSpongebozz = Arrays.asList(
            "Yo du versuchst damit den Schwamm zu verletzen, doch ich bin wie der Takt, du kannst mich nicht treffen.",
            "Live kann man sehen, dieser Blender geht in Deckung wenn ich schieße. Denn Kollegah haelt hoechstens mal das Tempo wenn ich niese.",
            "Sie starren panisch ins Pumpgunrohr, denn ich habe mehr Bullen getoetet als ein spanischer Mathador.",
            "Ihr seid breiter als der Tuersteher? Ich bin breiter als ne Cracknutte."
    );



    public static SpeechletResponse getRandomPunchlineIntent() {

        // get random rapper
        int random = (int) Math.random() * 3;
        String rapperName;

        //get random Punchline of the rapper

        if (random == 0) {
            String punchline = "Hier ist eine Punchline von Farid Bang: " + punchlinesKollegah.get((new Random()).nextInt(punchlinesKollegah.size()));

            PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
            speech.setText(punchline);

            // Create the Simple card content.
            SimpleCard card = new SimpleCard();
            card.setTitle("Punchline");
            card.setContent(punchline);

            return SpeechletResponse.newTellResponse(speech, card);

        } else if (random == 1) {
            String punchline = "Hier ist eine Punchline von Farid Bang: " + punchlinesFarid.get((new Random()).nextInt(punchlinesFarid.size()));

            PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
            speech.setText(punchline);

            // Create the Simple card content.
            SimpleCard card = new SimpleCard();
            card.setTitle("Punchline");
            card.setContent(punchline);

            return SpeechletResponse.newTellResponse(speech, card);


        } else {
            String punchline = "Hier ist eine Punchline von Spongebozz: " + punchlinesSpongebozz.get((new Random()).nextInt(punchlinesSpongebozz.size()));

            PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
            speech.setText(punchline);

            // Create the Simple card content.
            SimpleCard card = new SimpleCard();
            card.setTitle("Punchline");
            card.setContent(punchline);

            return SpeechletResponse.newTellResponse(speech, card);
        }

    }


    public static SpeechletResponse getRapperPunchlineIntent(Intent intent) {

        Slot rapperSlot = intent.getSlot("Rapper");
        String nameRapper = rapperSlot.getValue();

        if("Farid bang".equals(nameRapper)) {

            String punchline = punchlinesFarid.get((new Random()).nextInt(punchlinesFarid.size()));

            PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
            speech.setText(punchline);

            // Create the Simple card content.
            SimpleCard card = new SimpleCard();
            card.setTitle("Punchline");
            card.setContent(punchline);

            return SpeechletResponse.newTellResponse(speech, card);

        } else if ("kollegah".equals(nameRapper)) {

            String punchline = punchlinesKollegah.get((new Random()).nextInt(punchlinesKollegah.size()));

            PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
            speech.setText(punchline);

            // Create the Simple card content.
            SimpleCard card = new SimpleCard();
            card.setTitle("Punchline");
            card.setContent(punchline);

            return SpeechletResponse.newTellResponse(speech, card);

        } else if ("spongebozz".equals(nameRapper)) {

            String punchline = punchlinesSpongebozz.get((new Random()).nextInt(punchlinesSpongebozz.size()));

            PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
            speech.setText(punchline);

            // Create the Simple card content.
            SimpleCard card = new SimpleCard();
            card.setTitle("Punchline");
            card.setContent(punchline);

            return SpeechletResponse.newTellResponse(speech, card);

        } else {

            PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
            speech.setText("Diese Rapper kenne ich leider noch nicht.");

            // Create the Simple card content.
            SimpleCard card = new SimpleCard();
            card.setTitle("Punchline");
            card.setContent("Mist");

            return SpeechletResponse.newTellResponse(speech, card);

        }

    }





}
