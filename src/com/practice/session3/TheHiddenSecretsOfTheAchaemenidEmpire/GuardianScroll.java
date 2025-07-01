package com.practice.session3.TheHiddenSecretsOfTheAchaemenidEmpire;

import java.util.ArrayList;

public class GuardianScroll {
    public String scrollName;
    private String secretTechnique;
    protected String successorKnowledge;
    ArrayList<String> alliancePacts;

    public String getSecretTechnique() {
        return secretTechnique;
    }

    public void setSecretTechnique(String secretTechnique) {
        this.secretTechnique = secretTechnique;
    }

    public ArrayList<String> getAlliancePacts() {
        return alliancePacts;
    }

    public void setAlliancePacts(ArrayList<String> alliancePacts) {
        this.alliancePacts = alliancePacts;
    }

    public GuardianScroll(String scrollName,
                          String secretTechnique,
                          String successorKnowledge,
                          ArrayList<String> alliancePacts)
    {
        this.scrollName=scrollName;
        this.secretTechnique=secretTechnique;
        this.successorKnowledge=successorKnowledge;
        this.alliancePacts=alliancePacts;


    }
}
