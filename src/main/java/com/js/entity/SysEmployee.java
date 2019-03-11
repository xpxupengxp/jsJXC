package com.js.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工类（js_sys_employee）
 */
public class SysEmployee implements Serializable {
    private Integer userId;//员工ID

    private Integer[] userIds;//员工ID数组

    private String userCode;//员工编号

    private String userName;//姓名

    private String userMobile;//手机

    private String userTelephone;//电话

    private String userAddress;//地址

    private String userQq;//qq

    private String userEmail;//电子邮件

    private String userSex;//性别

    private String birthday;//生日

    private String idCard;//员工卡

    private String education;//教育程度

    private String userBaseRemark;//用户基本评语

    private String userEthnicity;//民族

    private String userHukou;//户口

    private String userHunyin;//婚姻

    private Date userInduction;//入职时间

    private String userJoinInsurance;//用户参保

    private String userShebao;//社保

    private String userLaborContractEnd;//合同终止时间

    private String userLaborContractStart;//合同开始时间

    private String userLaborRelations;//劳动关系

    private String userLinkmanPhone;//联系人电话

    private String userOtherInsurance;//参加意外保险

    private String userOtherLinkman;//其他联系人

    private String userPlaceNow;//现居住地

    private String userPhoto;//员工照片

    private String userZzmm;//政治面貌

    private Byte isMaster;//是否正式员工（0：试用，1：正式）

    private String objectId;//对象编号

    private Integer orgId;//所属组织

    private Integer status;//状态（0:禁用，1:正常）

    private static final long serialVersionUID = 1L;

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    private Boolean accType;//账号类型


    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Boolean getAccType() {
        return accType;
    }

    public void setAccType(Boolean accType) {
        this.accType = accType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone == null ? null : userTelephone.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getUserBaseRemark() {
        return userBaseRemark;
    }

    public void setUserBaseRemark(String userBaseRemark) {
        this.userBaseRemark = userBaseRemark == null ? null : userBaseRemark.trim();
    }

    public String getUserEthnicity() {
        return userEthnicity;
    }

    public void setUserEthnicity(String userEthnicity) {
        this.userEthnicity = userEthnicity == null ? null : userEthnicity.trim();
    }

    public String getUserHukou() {
        return userHukou;
    }

    public void setUserHukou(String userHukou) {
        this.userHukou = userHukou == null ? null : userHukou.trim();
    }

    public String getUserHunyin() {
        return userHunyin;
    }

    public void setUserHunyin(String userHunyin) {
        this.userHunyin = userHunyin == null ? null : userHunyin.trim();
    }

    public Date getUserInduction() {
        return userInduction;
    }

    public void setUserInduction(Date userInduction) {
        this.userInduction = userInduction;
    }

    public String getUserJoinInsurance() {
        return userJoinInsurance;
    }

    public void setUserJoinInsurance(String userJoinInsurance) {
        this.userJoinInsurance = userJoinInsurance == null ? null : userJoinInsurance.trim();
    }

    public String getUserShebao() {
        return userShebao;
    }

    public void setUserShebao(String userShebao) {
        this.userShebao = userShebao == null ? null : userShebao.trim();
    }

    public String getUserLaborContractEnd() {
        return userLaborContractEnd;
    }

    public void setUserLaborContractEnd(String userLaborContractEnd) {
        this.userLaborContractEnd = userLaborContractEnd == null ? null : userLaborContractEnd.trim();
    }

    public String getUserLaborContractStart() {
        return userLaborContractStart;
    }

    public void setUserLaborContractStart(String userLaborContractStart) {
        this.userLaborContractStart = userLaborContractStart == null ? null : userLaborContractStart.trim();
    }

    public String getUserLaborRelations() {
        return userLaborRelations;
    }

    public void setUserLaborRelations(String userLaborRelations) {
        this.userLaborRelations = userLaborRelations == null ? null : userLaborRelations.trim();
    }

    public String getUserLinkmanPhone() {
        return userLinkmanPhone;
    }

    public void setUserLinkmanPhone(String userLinkmanPhone) {
        this.userLinkmanPhone = userLinkmanPhone == null ? null : userLinkmanPhone.trim();
    }

    public String getUserOtherInsurance() {
        return userOtherInsurance;
    }

    public void setUserOtherInsurance(String userOtherInsurance) {
        this.userOtherInsurance = userOtherInsurance == null ? null : userOtherInsurance.trim();
    }

    public String getUserOtherLinkman() {
        return userOtherLinkman;
    }

    public void setUserOtherLinkman(String userOtherLinkman) {
        this.userOtherLinkman = userOtherLinkman == null ? null : userOtherLinkman.trim();
    }

    public String getUserPlaceNow() {
        return userPlaceNow;
    }

    public void setUserPlaceNow(String userPlaceNow) {
        this.userPlaceNow = userPlaceNow == null ? null : userPlaceNow.trim();
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserZzmm() {
        return userZzmm;
    }

    public void setUserZzmm(String userZzmm) {
        this.userZzmm = userZzmm == null ? null : userZzmm.trim();
    }

    public Byte getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Byte isMaster) {
        this.isMaster = isMaster;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer[] getUserIds() {
        return userIds;
    }

    public void setUserIds(Integer[] userIds) {
        this.userIds = userIds;
    }
}