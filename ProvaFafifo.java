public class ProvaFafifo extends ProvaUniversidade {


    public ProvaFafifo(float AV1, float AV2) {
        super(AV1, AV2);
    }


    public boolean aprovado() {
        calcularMedia();
        return mediaFinal >= 6;
    }
}
