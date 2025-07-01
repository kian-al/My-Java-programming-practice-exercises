package com.practice.session3.TheHiddenSecretsOfTheAchaemenidEmpire;

import java.util.ArrayList;

public class MageScroll extends GuardianScroll{
    public MageScroll(String scrollName,
                      String secretTechnique,
                      String successorKnowledge,
                      ArrayList<String> alliancePacts){
        super(scrollName, secretTechnique, successorKnowledge, alliancePacts);
    }
    public void addAlliancePact(String pact){
        this.alliancePacts.add(pact);
    }

}
