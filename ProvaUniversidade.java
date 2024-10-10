public class ProvaUniversidade {
    float AV1;
    float AV2;
    float mediaFinal;


    public ProvaUniversidade(float AV1, float AV2) {
        this.AV1 = AV1;
        this.AV2 = AV2;
    }


    public void calcularMedia() {
        mediaFinal = (this.AV1 + this.AV2) / 2;
    }
}
