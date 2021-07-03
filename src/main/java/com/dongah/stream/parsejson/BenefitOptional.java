package com.dongah.stream.parsejson;

import java.util.Optional;

public class BenefitOptional {
    public static void main(String[] args) {
        /*Optional<CartCpnAplyModel> optCartAplyInfo = otherPdAplyCpnList.stream()
                .filter(dt -> dt.getCpnIssNo().equals(optCpnIssNo)
                        || (CollectionUtils.isNotEmpty(dt.getCpnIssNos()) && dt.getCpnIssNos().contains(optCpnIssNo)))
                .findFirst();

        if(optCartAplyInfo.isPresent()) {

        }*/

        Optional<BenefitModel> optBenefit = Optional.empty();
        if(optBenefit.isPresent()){
            System.out.println(optBenefit.get());
        }
    }
}
