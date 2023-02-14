// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConfigurationRecordersRecorder {
    /**
     * @return The ID of the Alicloud account.
     * 
     */
    private String accountId;
    /**
     * @return The ID of the Config Configuration Recorder. Value as the `account_id`.
     * 
     */
    private String id;
    /**
     * @return Enterprise version configuration audit enabled status.
     * 
     */
    private String organizationEnableStatus;
    /**
     * @return The ID of the Enterprise management account.
     * 
     */
    private Integer organizationMasterId;
    /**
     * @return A list of resource types to be monitored.
     * 
     */
    private List<String> resourceTypes;
    /**
     * @return Status of resource monitoring.
     * 
     */
    private String status;

    private GetConfigurationRecordersRecorder() {}
    /**
     * @return The ID of the Alicloud account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The ID of the Config Configuration Recorder. Value as the `account_id`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Enterprise version configuration audit enabled status.
     * 
     */
    public String organizationEnableStatus() {
        return this.organizationEnableStatus;
    }
    /**
     * @return The ID of the Enterprise management account.
     * 
     */
    public Integer organizationMasterId() {
        return this.organizationMasterId;
    }
    /**
     * @return A list of resource types to be monitored.
     * 
     */
    public List<String> resourceTypes() {
        return this.resourceTypes;
    }
    /**
     * @return Status of resource monitoring.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationRecordersRecorder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String id;
        private String organizationEnableStatus;
        private Integer organizationMasterId;
        private List<String> resourceTypes;
        private String status;
        public Builder() {}
        public Builder(GetConfigurationRecordersRecorder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.organizationEnableStatus = defaults.organizationEnableStatus;
    	      this.organizationMasterId = defaults.organizationMasterId;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder organizationEnableStatus(String organizationEnableStatus) {
            this.organizationEnableStatus = Objects.requireNonNull(organizationEnableStatus);
            return this;
        }
        @CustomType.Setter
        public Builder organizationMasterId(Integer organizationMasterId) {
            this.organizationMasterId = Objects.requireNonNull(organizationMasterId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceTypes(List<String> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetConfigurationRecordersRecorder build() {
            final var o = new GetConfigurationRecordersRecorder();
            o.accountId = accountId;
            o.id = id;
            o.organizationEnableStatus = organizationEnableStatus;
            o.organizationMasterId = organizationMasterId;
            o.resourceTypes = resourceTypes;
            o.status = status;
            return o;
        }
    }
}