package DTO;

public class TKDiemDTO {
    
    private float dtb;
    private String ChuyenDe;
    private int quesR;
    private int quesW;
    private int quesP;
    private int soBai;

    public TKDiemDTO(){

    }
    
    public TKDiemDTO(float dtb, String chuyenDe, int quesR, int quesW, int quesP, int soBai){
        this.dtb = dtb;
        this.ChuyenDe = chuyenDe;
        this.quesR = quesR;
        this.quesW = quesW;
        this.quesP = quesP;
        this.soBai = soBai;
    }

    public float getDtb(){
        return dtb;
    }
    public void setDtb(float dtb){
        this.dtb = dtb;
    }

    public String getChuyenDe(){
        return ChuyenDe;
    }
    public void setChuyenDe(String ChuyenDe){
        this.ChuyenDe = ChuyenDe;
    }

    public int getQuesR(){
        return quesR;
    }
    public void setQuesR(int quesR){
        this.quesR = quesR;
    }

    public int getQuesW(){
        return quesW;
    }
    public void setQuesW(int quesW){
        this.quesW = quesW;
    }
    
    public int getQuesP(){
        return quesP;
    }
    public void setQuesP(int quesP){
        this.quesP = quesP;
    }
    
    public int getSoBai(){
        return soBai;
    }
    public void setSoBai(int soBai){
        this.soBai = soBai;
    }
    

}
