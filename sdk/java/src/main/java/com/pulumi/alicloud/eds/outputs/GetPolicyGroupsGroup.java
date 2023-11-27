// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.alicloud.eds.outputs.GetPolicyGroupsGroupAuthorizeAccessPolicyRule;
import com.pulumi.alicloud.eds.outputs.GetPolicyGroupsGroupAuthorizeSecurityPolicyRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyGroupsGroup {
    /**
     * @return The rule of authorize access rule.
     * 
     */
    private List<GetPolicyGroupsGroupAuthorizeAccessPolicyRule> authorizeAccessPolicyRules;
    /**
     * @return The policy rule.
     * 
     */
    private List<GetPolicyGroupsGroupAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules;
    /**
     * @return Whether to enable local camera redirection. Valid values: `on`, `off`.
     * 
     */
    private String cameraRedirect;
    /**
     * @return The clipboard policy.
     * 
     */
    private String clipboard;
    /**
     * @return The list of domain.
     * 
     */
    private String domainList;
    /**
     * @return The count of eds.
     * 
     */
    private Integer edsCount;
    /**
     * @return The access of html5.
     * 
     */
    private String htmlAccess;
    /**
     * @return The html5 file transfer.
     * 
     */
    private String htmlFileTransfer;
    /**
     * @return The ID of the Policy Group.
     * 
     */
    private String id;
    /**
     * @return Local drive redirect policy.
     * 
     */
    private String localDrive;
    /**
     * @return The policy group id.
     * 
     */
    private String policyGroupId;
    /**
     * @return The name of policy group.
     * 
     */
    private String policyGroupName;
    /**
     * @return The type of policy group.
     * 
     */
    private String policyGroupType;
    /**
     * @return Whether to enable screen recording. Valid values: `off`, `alltime`, `period`.
     * 
     */
    private String recording;
    /**
     * @return The end time of recording.
     * 
     */
    private String recordingEndTime;
    /**
     * @return The fps of recording. Valid values: `2`, `5`, `10`, `15`.
     * 
     */
    private Integer recordingFps;
    /**
     * @return The start time of recording.
     * 
     */
    private String recordingStartTime;
    /**
     * @return The status of policy.
     * 
     */
    private String status;
    /**
     * @return The usb redirect policy.
     * 
     */
    private String usbRedirect;
    /**
     * @return The quality of visual.sae_ecdsae_nameecd_po
     * 
     */
    private String visualQuality;
    /**
     * @return The watermark policy.
     * 
     */
    private String watermark;
    /**
     * @return The watermark transparency.
     * 
     */
    private String watermarkTransparency;
    /**
     * @return The type of watemark.
     * 
     */
    private String watermarkType;

    private GetPolicyGroupsGroup() {}
    /**
     * @return The rule of authorize access rule.
     * 
     */
    public List<GetPolicyGroupsGroupAuthorizeAccessPolicyRule> authorizeAccessPolicyRules() {
        return this.authorizeAccessPolicyRules;
    }
    /**
     * @return The policy rule.
     * 
     */
    public List<GetPolicyGroupsGroupAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules() {
        return this.authorizeSecurityPolicyRules;
    }
    /**
     * @return Whether to enable local camera redirection. Valid values: `on`, `off`.
     * 
     */
    public String cameraRedirect() {
        return this.cameraRedirect;
    }
    /**
     * @return The clipboard policy.
     * 
     */
    public String clipboard() {
        return this.clipboard;
    }
    /**
     * @return The list of domain.
     * 
     */
    public String domainList() {
        return this.domainList;
    }
    /**
     * @return The count of eds.
     * 
     */
    public Integer edsCount() {
        return this.edsCount;
    }
    /**
     * @return The access of html5.
     * 
     */
    public String htmlAccess() {
        return this.htmlAccess;
    }
    /**
     * @return The html5 file transfer.
     * 
     */
    public String htmlFileTransfer() {
        return this.htmlFileTransfer;
    }
    /**
     * @return The ID of the Policy Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Local drive redirect policy.
     * 
     */
    public String localDrive() {
        return this.localDrive;
    }
    /**
     * @return The policy group id.
     * 
     */
    public String policyGroupId() {
        return this.policyGroupId;
    }
    /**
     * @return The name of policy group.
     * 
     */
    public String policyGroupName() {
        return this.policyGroupName;
    }
    /**
     * @return The type of policy group.
     * 
     */
    public String policyGroupType() {
        return this.policyGroupType;
    }
    /**
     * @return Whether to enable screen recording. Valid values: `off`, `alltime`, `period`.
     * 
     */
    public String recording() {
        return this.recording;
    }
    /**
     * @return The end time of recording.
     * 
     */
    public String recordingEndTime() {
        return this.recordingEndTime;
    }
    /**
     * @return The fps of recording. Valid values: `2`, `5`, `10`, `15`.
     * 
     */
    public Integer recordingFps() {
        return this.recordingFps;
    }
    /**
     * @return The start time of recording.
     * 
     */
    public String recordingStartTime() {
        return this.recordingStartTime;
    }
    /**
     * @return The status of policy.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The usb redirect policy.
     * 
     */
    public String usbRedirect() {
        return this.usbRedirect;
    }
    /**
     * @return The quality of visual.sae_ecdsae_nameecd_po
     * 
     */
    public String visualQuality() {
        return this.visualQuality;
    }
    /**
     * @return The watermark policy.
     * 
     */
    public String watermark() {
        return this.watermark;
    }
    /**
     * @return The watermark transparency.
     * 
     */
    public String watermarkTransparency() {
        return this.watermarkTransparency;
    }
    /**
     * @return The type of watemark.
     * 
     */
    public String watermarkType() {
        return this.watermarkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPolicyGroupsGroupAuthorizeAccessPolicyRule> authorizeAccessPolicyRules;
        private List<GetPolicyGroupsGroupAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules;
        private String cameraRedirect;
        private String clipboard;
        private String domainList;
        private Integer edsCount;
        private String htmlAccess;
        private String htmlFileTransfer;
        private String id;
        private String localDrive;
        private String policyGroupId;
        private String policyGroupName;
        private String policyGroupType;
        private String recording;
        private String recordingEndTime;
        private Integer recordingFps;
        private String recordingStartTime;
        private String status;
        private String usbRedirect;
        private String visualQuality;
        private String watermark;
        private String watermarkTransparency;
        private String watermarkType;
        public Builder() {}
        public Builder(GetPolicyGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizeAccessPolicyRules = defaults.authorizeAccessPolicyRules;
    	      this.authorizeSecurityPolicyRules = defaults.authorizeSecurityPolicyRules;
    	      this.cameraRedirect = defaults.cameraRedirect;
    	      this.clipboard = defaults.clipboard;
    	      this.domainList = defaults.domainList;
    	      this.edsCount = defaults.edsCount;
    	      this.htmlAccess = defaults.htmlAccess;
    	      this.htmlFileTransfer = defaults.htmlFileTransfer;
    	      this.id = defaults.id;
    	      this.localDrive = defaults.localDrive;
    	      this.policyGroupId = defaults.policyGroupId;
    	      this.policyGroupName = defaults.policyGroupName;
    	      this.policyGroupType = defaults.policyGroupType;
    	      this.recording = defaults.recording;
    	      this.recordingEndTime = defaults.recordingEndTime;
    	      this.recordingFps = defaults.recordingFps;
    	      this.recordingStartTime = defaults.recordingStartTime;
    	      this.status = defaults.status;
    	      this.usbRedirect = defaults.usbRedirect;
    	      this.visualQuality = defaults.visualQuality;
    	      this.watermark = defaults.watermark;
    	      this.watermarkTransparency = defaults.watermarkTransparency;
    	      this.watermarkType = defaults.watermarkType;
        }

        @CustomType.Setter
        public Builder authorizeAccessPolicyRules(List<GetPolicyGroupsGroupAuthorizeAccessPolicyRule> authorizeAccessPolicyRules) {
            this.authorizeAccessPolicyRules = Objects.requireNonNull(authorizeAccessPolicyRules);
            return this;
        }
        public Builder authorizeAccessPolicyRules(GetPolicyGroupsGroupAuthorizeAccessPolicyRule... authorizeAccessPolicyRules) {
            return authorizeAccessPolicyRules(List.of(authorizeAccessPolicyRules));
        }
        @CustomType.Setter
        public Builder authorizeSecurityPolicyRules(List<GetPolicyGroupsGroupAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules) {
            this.authorizeSecurityPolicyRules = Objects.requireNonNull(authorizeSecurityPolicyRules);
            return this;
        }
        public Builder authorizeSecurityPolicyRules(GetPolicyGroupsGroupAuthorizeSecurityPolicyRule... authorizeSecurityPolicyRules) {
            return authorizeSecurityPolicyRules(List.of(authorizeSecurityPolicyRules));
        }
        @CustomType.Setter
        public Builder cameraRedirect(String cameraRedirect) {
            this.cameraRedirect = Objects.requireNonNull(cameraRedirect);
            return this;
        }
        @CustomType.Setter
        public Builder clipboard(String clipboard) {
            this.clipboard = Objects.requireNonNull(clipboard);
            return this;
        }
        @CustomType.Setter
        public Builder domainList(String domainList) {
            this.domainList = Objects.requireNonNull(domainList);
            return this;
        }
        @CustomType.Setter
        public Builder edsCount(Integer edsCount) {
            this.edsCount = Objects.requireNonNull(edsCount);
            return this;
        }
        @CustomType.Setter
        public Builder htmlAccess(String htmlAccess) {
            this.htmlAccess = Objects.requireNonNull(htmlAccess);
            return this;
        }
        @CustomType.Setter
        public Builder htmlFileTransfer(String htmlFileTransfer) {
            this.htmlFileTransfer = Objects.requireNonNull(htmlFileTransfer);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localDrive(String localDrive) {
            this.localDrive = Objects.requireNonNull(localDrive);
            return this;
        }
        @CustomType.Setter
        public Builder policyGroupId(String policyGroupId) {
            this.policyGroupId = Objects.requireNonNull(policyGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder policyGroupName(String policyGroupName) {
            this.policyGroupName = Objects.requireNonNull(policyGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder policyGroupType(String policyGroupType) {
            this.policyGroupType = Objects.requireNonNull(policyGroupType);
            return this;
        }
        @CustomType.Setter
        public Builder recording(String recording) {
            this.recording = Objects.requireNonNull(recording);
            return this;
        }
        @CustomType.Setter
        public Builder recordingEndTime(String recordingEndTime) {
            this.recordingEndTime = Objects.requireNonNull(recordingEndTime);
            return this;
        }
        @CustomType.Setter
        public Builder recordingFps(Integer recordingFps) {
            this.recordingFps = Objects.requireNonNull(recordingFps);
            return this;
        }
        @CustomType.Setter
        public Builder recordingStartTime(String recordingStartTime) {
            this.recordingStartTime = Objects.requireNonNull(recordingStartTime);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder usbRedirect(String usbRedirect) {
            this.usbRedirect = Objects.requireNonNull(usbRedirect);
            return this;
        }
        @CustomType.Setter
        public Builder visualQuality(String visualQuality) {
            this.visualQuality = Objects.requireNonNull(visualQuality);
            return this;
        }
        @CustomType.Setter
        public Builder watermark(String watermark) {
            this.watermark = Objects.requireNonNull(watermark);
            return this;
        }
        @CustomType.Setter
        public Builder watermarkTransparency(String watermarkTransparency) {
            this.watermarkTransparency = Objects.requireNonNull(watermarkTransparency);
            return this;
        }
        @CustomType.Setter
        public Builder watermarkType(String watermarkType) {
            this.watermarkType = Objects.requireNonNull(watermarkType);
            return this;
        }
        public GetPolicyGroupsGroup build() {
            final var _resultValue = new GetPolicyGroupsGroup();
            _resultValue.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
            _resultValue.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
            _resultValue.cameraRedirect = cameraRedirect;
            _resultValue.clipboard = clipboard;
            _resultValue.domainList = domainList;
            _resultValue.edsCount = edsCount;
            _resultValue.htmlAccess = htmlAccess;
            _resultValue.htmlFileTransfer = htmlFileTransfer;
            _resultValue.id = id;
            _resultValue.localDrive = localDrive;
            _resultValue.policyGroupId = policyGroupId;
            _resultValue.policyGroupName = policyGroupName;
            _resultValue.policyGroupType = policyGroupType;
            _resultValue.recording = recording;
            _resultValue.recordingEndTime = recordingEndTime;
            _resultValue.recordingFps = recordingFps;
            _resultValue.recordingStartTime = recordingStartTime;
            _resultValue.status = status;
            _resultValue.usbRedirect = usbRedirect;
            _resultValue.visualQuality = visualQuality;
            _resultValue.watermark = watermark;
            _resultValue.watermarkTransparency = watermarkTransparency;
            _resultValue.watermarkType = watermarkType;
            return _resultValue;
        }
    }
}
