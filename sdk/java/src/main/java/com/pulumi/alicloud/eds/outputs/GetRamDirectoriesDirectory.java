// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.alicloud.eds.outputs.GetRamDirectoriesDirectoryAdConnector;
import com.pulumi.alicloud.eds.outputs.GetRamDirectoriesDirectoryLog;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRamDirectoriesDirectory {
    /**
     * @return The AD connectors.
     * 
     */
    private List<GetRamDirectoriesDirectoryAdConnector> adConnectors;
    /**
     * @return The CreateTime of resource.
     * 
     */
    private String createTime;
    /**
     * @return The id of the custom security group.
     * 
     */
    private String customSecurityGroupId;
    /**
     * @return The desktop access type.
     * 
     */
    private String desktopAccessType;
    /**
     * @return The desktop vpc endpoint.
     * 
     */
    private String desktopVpcEndpoint;
    /**
     * @return The directory type.
     * 
     */
    private String directoryType;
    /**
     * @return The address of DNSAddress.
     * 
     */
    private List<String> dnsAddresses;
    /**
     * @return The username of DNS.
     * 
     */
    private String dnsUserName;
    /**
     * @return The name of the domain.
     * 
     */
    private String domainName;
    /**
     * @return The domain password.
     * 
     */
    private String domainPassword;
    /**
     * @return The username of the domain.
     * 
     */
    private String domainUserName;
    /**
     * @return Whether to enable admin access.
     * 
     */
    private Boolean enableAdminAccess;
    /**
     * @return Whether to enable cross desktop access.
     * 
     */
    private Boolean enableCrossDesktopAccess;
    /**
     * @return Whether enable internet access.
     * 
     */
    private Boolean enableInternetAccess;
    /**
     * @return The ids of filesystem.
     * 
     */
    private List<String> fileSystemIds;
    /**
     * @return The ID of the Ram Directory.
     * 
     */
    private String id;
    /**
     * @return The register log information.
     * 
     */
    private List<GetRamDirectoriesDirectoryLog> logs;
    /**
     * @return Whether to enable MFA.
     * 
     */
    private Boolean mfaEnabled;
    /**
     * @return The ID of ram directory.
     * 
     */
    private String ramDirectoryId;
    /**
     * @return The name of directory.
     * 
     */
    private String ramDirectoryName;
    /**
     * @return Whether to enable SSO.
     * 
     */
    private Boolean ssoEnabled;
    /**
     * @return The status of directory.
     * 
     */
    private String status;
    /**
     * @return The address of sub DNS.
     * 
     */
    private List<String> subDnsAddresses;
    /**
     * @return The Name of the sub-domain.
     * 
     */
    private String subDomainName;
    /**
     * @return The trust password.
     * 
     */
    private String trustPassword;
    /**
     * @return The ID of the vpc.
     * 
     */
    private String vpcId;
    /**
     * @return List of VSwitch IDs in the directory.
     * 
     */
    private List<String> vswitchIds;

    private GetRamDirectoriesDirectory() {}
    /**
     * @return The AD connectors.
     * 
     */
    public List<GetRamDirectoriesDirectoryAdConnector> adConnectors() {
        return this.adConnectors;
    }
    /**
     * @return The CreateTime of resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The id of the custom security group.
     * 
     */
    public String customSecurityGroupId() {
        return this.customSecurityGroupId;
    }
    /**
     * @return The desktop access type.
     * 
     */
    public String desktopAccessType() {
        return this.desktopAccessType;
    }
    /**
     * @return The desktop vpc endpoint.
     * 
     */
    public String desktopVpcEndpoint() {
        return this.desktopVpcEndpoint;
    }
    /**
     * @return The directory type.
     * 
     */
    public String directoryType() {
        return this.directoryType;
    }
    /**
     * @return The address of DNSAddress.
     * 
     */
    public List<String> dnsAddresses() {
        return this.dnsAddresses;
    }
    /**
     * @return The username of DNS.
     * 
     */
    public String dnsUserName() {
        return this.dnsUserName;
    }
    /**
     * @return The name of the domain.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The domain password.
     * 
     */
    public String domainPassword() {
        return this.domainPassword;
    }
    /**
     * @return The username of the domain.
     * 
     */
    public String domainUserName() {
        return this.domainUserName;
    }
    /**
     * @return Whether to enable admin access.
     * 
     */
    public Boolean enableAdminAccess() {
        return this.enableAdminAccess;
    }
    /**
     * @return Whether to enable cross desktop access.
     * 
     */
    public Boolean enableCrossDesktopAccess() {
        return this.enableCrossDesktopAccess;
    }
    /**
     * @return Whether enable internet access.
     * 
     */
    public Boolean enableInternetAccess() {
        return this.enableInternetAccess;
    }
    /**
     * @return The ids of filesystem.
     * 
     */
    public List<String> fileSystemIds() {
        return this.fileSystemIds;
    }
    /**
     * @return The ID of the Ram Directory.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The register log information.
     * 
     */
    public List<GetRamDirectoriesDirectoryLog> logs() {
        return this.logs;
    }
    /**
     * @return Whether to enable MFA.
     * 
     */
    public Boolean mfaEnabled() {
        return this.mfaEnabled;
    }
    /**
     * @return The ID of ram directory.
     * 
     */
    public String ramDirectoryId() {
        return this.ramDirectoryId;
    }
    /**
     * @return The name of directory.
     * 
     */
    public String ramDirectoryName() {
        return this.ramDirectoryName;
    }
    /**
     * @return Whether to enable SSO.
     * 
     */
    public Boolean ssoEnabled() {
        return this.ssoEnabled;
    }
    /**
     * @return The status of directory.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The address of sub DNS.
     * 
     */
    public List<String> subDnsAddresses() {
        return this.subDnsAddresses;
    }
    /**
     * @return The Name of the sub-domain.
     * 
     */
    public String subDomainName() {
        return this.subDomainName;
    }
    /**
     * @return The trust password.
     * 
     */
    public String trustPassword() {
        return this.trustPassword;
    }
    /**
     * @return The ID of the vpc.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return List of VSwitch IDs in the directory.
     * 
     */
    public List<String> vswitchIds() {
        return this.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRamDirectoriesDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRamDirectoriesDirectoryAdConnector> adConnectors;
        private String createTime;
        private String customSecurityGroupId;
        private String desktopAccessType;
        private String desktopVpcEndpoint;
        private String directoryType;
        private List<String> dnsAddresses;
        private String dnsUserName;
        private String domainName;
        private String domainPassword;
        private String domainUserName;
        private Boolean enableAdminAccess;
        private Boolean enableCrossDesktopAccess;
        private Boolean enableInternetAccess;
        private List<String> fileSystemIds;
        private String id;
        private List<GetRamDirectoriesDirectoryLog> logs;
        private Boolean mfaEnabled;
        private String ramDirectoryId;
        private String ramDirectoryName;
        private Boolean ssoEnabled;
        private String status;
        private List<String> subDnsAddresses;
        private String subDomainName;
        private String trustPassword;
        private String vpcId;
        private List<String> vswitchIds;
        public Builder() {}
        public Builder(GetRamDirectoriesDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adConnectors = defaults.adConnectors;
    	      this.createTime = defaults.createTime;
    	      this.customSecurityGroupId = defaults.customSecurityGroupId;
    	      this.desktopAccessType = defaults.desktopAccessType;
    	      this.desktopVpcEndpoint = defaults.desktopVpcEndpoint;
    	      this.directoryType = defaults.directoryType;
    	      this.dnsAddresses = defaults.dnsAddresses;
    	      this.dnsUserName = defaults.dnsUserName;
    	      this.domainName = defaults.domainName;
    	      this.domainPassword = defaults.domainPassword;
    	      this.domainUserName = defaults.domainUserName;
    	      this.enableAdminAccess = defaults.enableAdminAccess;
    	      this.enableCrossDesktopAccess = defaults.enableCrossDesktopAccess;
    	      this.enableInternetAccess = defaults.enableInternetAccess;
    	      this.fileSystemIds = defaults.fileSystemIds;
    	      this.id = defaults.id;
    	      this.logs = defaults.logs;
    	      this.mfaEnabled = defaults.mfaEnabled;
    	      this.ramDirectoryId = defaults.ramDirectoryId;
    	      this.ramDirectoryName = defaults.ramDirectoryName;
    	      this.ssoEnabled = defaults.ssoEnabled;
    	      this.status = defaults.status;
    	      this.subDnsAddresses = defaults.subDnsAddresses;
    	      this.subDomainName = defaults.subDomainName;
    	      this.trustPassword = defaults.trustPassword;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchIds = defaults.vswitchIds;
        }

        @CustomType.Setter
        public Builder adConnectors(List<GetRamDirectoriesDirectoryAdConnector> adConnectors) {
            this.adConnectors = Objects.requireNonNull(adConnectors);
            return this;
        }
        public Builder adConnectors(GetRamDirectoriesDirectoryAdConnector... adConnectors) {
            return adConnectors(List.of(adConnectors));
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder customSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = Objects.requireNonNull(customSecurityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder desktopAccessType(String desktopAccessType) {
            this.desktopAccessType = Objects.requireNonNull(desktopAccessType);
            return this;
        }
        @CustomType.Setter
        public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
            this.desktopVpcEndpoint = Objects.requireNonNull(desktopVpcEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder directoryType(String directoryType) {
            this.directoryType = Objects.requireNonNull(directoryType);
            return this;
        }
        @CustomType.Setter
        public Builder dnsAddresses(List<String> dnsAddresses) {
            this.dnsAddresses = Objects.requireNonNull(dnsAddresses);
            return this;
        }
        public Builder dnsAddresses(String... dnsAddresses) {
            return dnsAddresses(List.of(dnsAddresses));
        }
        @CustomType.Setter
        public Builder dnsUserName(String dnsUserName) {
            this.dnsUserName = Objects.requireNonNull(dnsUserName);
            return this;
        }
        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder domainPassword(String domainPassword) {
            this.domainPassword = Objects.requireNonNull(domainPassword);
            return this;
        }
        @CustomType.Setter
        public Builder domainUserName(String domainUserName) {
            this.domainUserName = Objects.requireNonNull(domainUserName);
            return this;
        }
        @CustomType.Setter
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.enableAdminAccess = Objects.requireNonNull(enableAdminAccess);
            return this;
        }
        @CustomType.Setter
        public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
            this.enableCrossDesktopAccess = Objects.requireNonNull(enableCrossDesktopAccess);
            return this;
        }
        @CustomType.Setter
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = Objects.requireNonNull(enableInternetAccess);
            return this;
        }
        @CustomType.Setter
        public Builder fileSystemIds(List<String> fileSystemIds) {
            this.fileSystemIds = Objects.requireNonNull(fileSystemIds);
            return this;
        }
        public Builder fileSystemIds(String... fileSystemIds) {
            return fileSystemIds(List.of(fileSystemIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder logs(List<GetRamDirectoriesDirectoryLog> logs) {
            this.logs = Objects.requireNonNull(logs);
            return this;
        }
        public Builder logs(GetRamDirectoriesDirectoryLog... logs) {
            return logs(List.of(logs));
        }
        @CustomType.Setter
        public Builder mfaEnabled(Boolean mfaEnabled) {
            this.mfaEnabled = Objects.requireNonNull(mfaEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder ramDirectoryId(String ramDirectoryId) {
            this.ramDirectoryId = Objects.requireNonNull(ramDirectoryId);
            return this;
        }
        @CustomType.Setter
        public Builder ramDirectoryName(String ramDirectoryName) {
            this.ramDirectoryName = Objects.requireNonNull(ramDirectoryName);
            return this;
        }
        @CustomType.Setter
        public Builder ssoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = Objects.requireNonNull(ssoEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder subDnsAddresses(List<String> subDnsAddresses) {
            this.subDnsAddresses = Objects.requireNonNull(subDnsAddresses);
            return this;
        }
        public Builder subDnsAddresses(String... subDnsAddresses) {
            return subDnsAddresses(List.of(subDnsAddresses));
        }
        @CustomType.Setter
        public Builder subDomainName(String subDomainName) {
            this.subDomainName = Objects.requireNonNull(subDomainName);
            return this;
        }
        @CustomType.Setter
        public Builder trustPassword(String trustPassword) {
            this.trustPassword = Objects.requireNonNull(trustPassword);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        @CustomType.Setter
        public Builder vswitchIds(List<String> vswitchIds) {
            this.vswitchIds = Objects.requireNonNull(vswitchIds);
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }
        public GetRamDirectoriesDirectory build() {
            final var _resultValue = new GetRamDirectoriesDirectory();
            _resultValue.adConnectors = adConnectors;
            _resultValue.createTime = createTime;
            _resultValue.customSecurityGroupId = customSecurityGroupId;
            _resultValue.desktopAccessType = desktopAccessType;
            _resultValue.desktopVpcEndpoint = desktopVpcEndpoint;
            _resultValue.directoryType = directoryType;
            _resultValue.dnsAddresses = dnsAddresses;
            _resultValue.dnsUserName = dnsUserName;
            _resultValue.domainName = domainName;
            _resultValue.domainPassword = domainPassword;
            _resultValue.domainUserName = domainUserName;
            _resultValue.enableAdminAccess = enableAdminAccess;
            _resultValue.enableCrossDesktopAccess = enableCrossDesktopAccess;
            _resultValue.enableInternetAccess = enableInternetAccess;
            _resultValue.fileSystemIds = fileSystemIds;
            _resultValue.id = id;
            _resultValue.logs = logs;
            _resultValue.mfaEnabled = mfaEnabled;
            _resultValue.ramDirectoryId = ramDirectoryId;
            _resultValue.ramDirectoryName = ramDirectoryName;
            _resultValue.ssoEnabled = ssoEnabled;
            _resultValue.status = status;
            _resultValue.subDnsAddresses = subDnsAddresses;
            _resultValue.subDomainName = subDomainName;
            _resultValue.trustPassword = trustPassword;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchIds = vswitchIds;
            return _resultValue;
        }
    }
}
