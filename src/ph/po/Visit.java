package ph.po;

public class Visit
{
    private int id;//病历I
    private int petId;//所对应的宠物表的主键Id
    private int vetId;//所对应的医生表的主键Id
    private String vetName;//所对应的医生表的医生姓名
    private String petName;//所对应的宠物表的宠物姓名
    private String ownerName;//所对应的用户表的用户姓名
    private String visitdate;//病历就诊日期
    private String description;//病情描述
    private String treatment;//治疗方案

    public String getVetName()
    {
        return vetName;
    }
    public void setVetName(String vetName)
    {
        this.vetName = vetName;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getPetId() {
        return petId;
    }
    public void setPetId(int petId)
    {
        this.petId = petId;
    }
    public int getVetId()
    {
        return vetId;
    }
    public void setVetId(int vetId)
    {
        this.vetId = vetId;
    }
    public String getVisitdate()
    {
        return visitdate;
    }
    public void setVisitdate(String visitdate)
    {
        this.visitdate = visitdate;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getTreatment()
    {
        return treatment;
    }
    public void setTreatment(String treatment)
    {
        this.treatment = treatment;
    }

    public String getPetName()
    {
        return petName;
    }
    public void setPetName(String petName)
    {
        this.petName = petName;
    }

    public String setOwnerName()
    {
        return ownerName;
    }
    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }
}
