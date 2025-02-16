package com.tencentcloudapi.organization.v20210331;
public enum OrganizationErrorCode {
    // 用户未实名。
     FAILEDOPERATION_AUTHINFOEMPTY("FailedOperation.AuthInfoEmpty"),
     
    // 用户非企业实名。
     FAILEDOPERATION_AUTHNOTENTERPRISE("FailedOperation.AuthNotEnterprise"),
     
    // 创建成员异常。
     FAILEDOPERATION_CREATEACCOUNT("FailedOperation.CreateAccount"),
     
    // 账号实名认证超过上限。
     FAILEDOPERATION_CREATEMEMBERAUTHOVERLIMIT("FailedOperation.CreateMemberAuthOverLimit"),
     
    // 创建已成功。
     FAILEDOPERATION_CREATERECORDALREADYSUCCESS("FailedOperation.CreateRecordAlreadySuccess"),
     
    // 创建记录不存在。
     FAILEDOPERATION_CREATERECORDNOTEXIST("FailedOperation.CreateRecordNotExist"),
     
    // 创建角色异常。
     FAILEDOPERATION_CREATEROLE("FailedOperation.CreateRole"),
     
    // 名字已经被使用。
     FAILEDOPERATION_MEMBERNAMEUSED("FailedOperation.MemberNameUsed"),
     
    // 操作策略失败。
     FAILEDOPERATION_OPERATEPOLICY("FailedOperation.OperatePolicy"),
     
    // 成员名已存在。
     FAILEDOPERATION_ORGANIZATIONMEMBERNAMEUSED("FailedOperation.OrganizationMemberNameUsed"),
     
    // 组织节点不存在。
     FAILEDOPERATION_ORGANIZATIONNODENOTEXIST("FailedOperation.OrganizationNodeNotExist"),
     
    // 组织权限不合法。
     FAILEDOPERATION_ORGANIZATIONPERMISSIONILLEGAL("FailedOperation.OrganizationPermissionIllegal"),
     
    // 组织策略不合法。
     FAILEDOPERATION_ORGANIZATIONPOLICYILLEGAL("FailedOperation.OrganizationPolicyIllegal"),
     
    // 子账号不存在。
     FAILEDOPERATION_SUBACCOUNTNOTEXIST("FailedOperation.SubAccountNotExist"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 创建成员超过上限。
     LIMITEXCEEDED_CREATEMEMBEROVERLIMIT("LimitExceeded.CreateMemberOverLimit"),
     
    // 成员超过上限。
     LIMITEXCEEDED_ORGANIZATIONMEMBEROVERLIMIT("LimitExceeded.OrganizationMemberOverLimit"),
     
    // 成员不存在。
     RESOURCENOTFOUND_MEMBERNOTEXIST("ResourceNotFound.MemberNotExist"),
     
    // 组织成员策略不存在。
     RESOURCENOTFOUND_MEMBERPOLICYNOTEXIST("ResourceNotFound.MemberPolicyNotExist"),
     
    // 企业组织不存在。
     RESOURCENOTFOUND_ORGANIZATIONNOTEXIST("ResourceNotFound.OrganizationNotExist");
     
    private String value;
    private OrganizationErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

