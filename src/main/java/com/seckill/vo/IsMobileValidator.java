package com.seckill.vo;

import com.seckill.utils.ValidatorUtil;
import com.seckill.validator.IsMobile;
import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @description 手机号码校验规则
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile,String> {

    private boolean required = false;

    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(required){
            return ValidatorUtil.isMobile(s);
        } else {
            if(StringUtils.isEmpty(s)){
                return true;
            } else {
                return ValidatorUtil.isMobile(s);
            }
        }
    }
}
