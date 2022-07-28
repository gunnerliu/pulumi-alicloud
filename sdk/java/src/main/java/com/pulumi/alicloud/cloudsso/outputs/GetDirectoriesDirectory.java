// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.outputs;

import com.pulumi.alicloud.cloudsso.outputs.GetDirectoriesDirectorySamlIdentityProviderConfiguration;
import com.pulumi.alicloud.cloudsso.outputs.GetDirectoriesDirectoryTask;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDirectoriesDirectory {
    /**
     * @return Saml identifies the creation time of the provider configuration.
     * 
     */
    private final String createTime;
    /**
     * @return The DirectoryId of the CloudSSO directory.
     * 
     */
    private final String directoryId;
    /**
     * @return The name of the CloudSSO directory.
     * 
     */
    private final String directoryName;
    /**
     * @return The ID of the Directory.
     * 
     */
    private final String id;
    /**
     * @return The mfa authentication status. Valid values: `Enabled` or `Disabled`. Default to `Disabled`.
     * 
     */
    private final String mfaAuthenticationStatus;
    /**
     * @return The Region of the CloudSSO directory.
     * 
     */
    private final String region;
    /**
     * @return The saml identity provider configuration.
     * 
     */
    private final List<GetDirectoriesDirectorySamlIdentityProviderConfiguration> samlIdentityProviderConfigurations;
    /**
     * @return The scim synchronization status. Valid values: `Enabled` or `Disabled`. Default to `Disabled`.
     * 
     */
    private final String scimSynchronizationStatus;
    /**
     * @return Asynchronous Task Information Array.
     * 
     */
    private final List<GetDirectoriesDirectoryTask> tasks;

    @CustomType.Constructor
    private GetDirectoriesDirectory(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("directoryId") String directoryId,
        @CustomType.Parameter("directoryName") String directoryName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mfaAuthenticationStatus") String mfaAuthenticationStatus,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("samlIdentityProviderConfigurations") List<GetDirectoriesDirectorySamlIdentityProviderConfiguration> samlIdentityProviderConfigurations,
        @CustomType.Parameter("scimSynchronizationStatus") String scimSynchronizationStatus,
        @CustomType.Parameter("tasks") List<GetDirectoriesDirectoryTask> tasks) {
        this.createTime = createTime;
        this.directoryId = directoryId;
        this.directoryName = directoryName;
        this.id = id;
        this.mfaAuthenticationStatus = mfaAuthenticationStatus;
        this.region = region;
        this.samlIdentityProviderConfigurations = samlIdentityProviderConfigurations;
        this.scimSynchronizationStatus = scimSynchronizationStatus;
        this.tasks = tasks;
    }

    /**
     * @return Saml identifies the creation time of the provider configuration.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The DirectoryId of the CloudSSO directory.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The name of the CloudSSO directory.
     * 
     */
    public String directoryName() {
        return this.directoryName;
    }
    /**
     * @return The ID of the Directory.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The mfa authentication status. Valid values: `Enabled` or `Disabled`. Default to `Disabled`.
     * 
     */
    public String mfaAuthenticationStatus() {
        return this.mfaAuthenticationStatus;
    }
    /**
     * @return The Region of the CloudSSO directory.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The saml identity provider configuration.
     * 
     */
    public List<GetDirectoriesDirectorySamlIdentityProviderConfiguration> samlIdentityProviderConfigurations() {
        return this.samlIdentityProviderConfigurations;
    }
    /**
     * @return The scim synchronization status. Valid values: `Enabled` or `Disabled`. Default to `Disabled`.
     * 
     */
    public String scimSynchronizationStatus() {
        return this.scimSynchronizationStatus;
    }
    /**
     * @return Asynchronous Task Information Array.
     * 
     */
    public List<GetDirectoriesDirectoryTask> tasks() {
        return this.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoriesDirectory defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String directoryId;
        private String directoryName;
        private String id;
        private String mfaAuthenticationStatus;
        private String region;
        private List<GetDirectoriesDirectorySamlIdentityProviderConfiguration> samlIdentityProviderConfigurations;
        private String scimSynchronizationStatus;
        private List<GetDirectoriesDirectoryTask> tasks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectoriesDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.directoryId = defaults.directoryId;
    	      this.directoryName = defaults.directoryName;
    	      this.id = defaults.id;
    	      this.mfaAuthenticationStatus = defaults.mfaAuthenticationStatus;
    	      this.region = defaults.region;
    	      this.samlIdentityProviderConfigurations = defaults.samlIdentityProviderConfigurations;
    	      this.scimSynchronizationStatus = defaults.scimSynchronizationStatus;
    	      this.tasks = defaults.tasks;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        public Builder directoryName(String directoryName) {
            this.directoryName = Objects.requireNonNull(directoryName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mfaAuthenticationStatus(String mfaAuthenticationStatus) {
            this.mfaAuthenticationStatus = Objects.requireNonNull(mfaAuthenticationStatus);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder samlIdentityProviderConfigurations(List<GetDirectoriesDirectorySamlIdentityProviderConfiguration> samlIdentityProviderConfigurations) {
            this.samlIdentityProviderConfigurations = Objects.requireNonNull(samlIdentityProviderConfigurations);
            return this;
        }
        public Builder samlIdentityProviderConfigurations(GetDirectoriesDirectorySamlIdentityProviderConfiguration... samlIdentityProviderConfigurations) {
            return samlIdentityProviderConfigurations(List.of(samlIdentityProviderConfigurations));
        }
        public Builder scimSynchronizationStatus(String scimSynchronizationStatus) {
            this.scimSynchronizationStatus = Objects.requireNonNull(scimSynchronizationStatus);
            return this;
        }
        public Builder tasks(List<GetDirectoriesDirectoryTask> tasks) {
            this.tasks = Objects.requireNonNull(tasks);
            return this;
        }
        public Builder tasks(GetDirectoriesDirectoryTask... tasks) {
            return tasks(List.of(tasks));
        }        public GetDirectoriesDirectory build() {
            return new GetDirectoriesDirectory(createTime, directoryId, directoryName, id, mfaAuthenticationStatus, region, samlIdentityProviderConfigurations, scimSynchronizationStatus, tasks);
        }
    }
}
