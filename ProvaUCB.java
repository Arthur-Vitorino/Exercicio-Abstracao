public class ProvaUCB extends ProvaUniversidade {


    public ProvaUCB(float AV1, float AV2) {
        super(AV1, AV2);
    }


    public boolean aprovado() {
        calcularMedia();
        return mediaFinal >= 7;
    }
}
