// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.brain.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIndustrialPidOrganizationsOrganization {
    /**
     * @return The ID of the Pid Organization.
     * 
     */
    private String id;
    /**
     * @return The parent organization id.
     * 
     */
    private String parentPidOrganizationId;
    /**
     * @return The organization id.
     * 
     */
    private String pidOrganizationId;
    /**
     * @return The organization level.
     * 
     */
    private Integer pidOrganizationLevel;
    /**
     * @return The organization name.
     * 
     */
    private String pidOrganizationName;

    private GetIndustrialPidOrganizationsOrganization() {}
    /**
     * @return The ID of the Pid Organization.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The parent organization id.
     * 
     */
    public String parentPidOrganizationId() {
        return this.parentPidOrganizationId;
    }
    /**
     * @return The organization id.
     * 
     */
    public String pidOrganizationId() {
        return this.pidOrganizationId;
    }
    /**
     * @return The organization level.
     * 
     */
    public Integer pidOrganizationLevel() {
        return this.pidOrganizationLevel;
    }
    /**
     * @return The organization name.
     * 
     */
    public String pidOrganizationName() {
        return this.pidOrganizationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndustrialPidOrganizationsOrganization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String parentPidOrganizationId;
        private String pidOrganizationId;
        private Integer pidOrganizationLevel;
        private String pidOrganizationName;
        public Builder() {}
        public Builder(GetIndustrialPidOrganizationsOrganization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parentPidOrganizationId = defaults.parentPidOrganizationId;
    	      this.pidOrganizationId = defaults.pidOrganizationId;
    	      this.pidOrganizationLevel = defaults.pidOrganizationLevel;
    	      this.pidOrganizationName = defaults.pidOrganizationName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder parentPidOrganizationId(String parentPidOrganizationId) {
            this.parentPidOrganizationId = Objects.requireNonNull(parentPidOrganizationId);
            return this;
        }
        @CustomType.Setter
        public Builder pidOrganizationId(String pidOrganizationId) {
            this.pidOrganizationId = Objects.requireNonNull(pidOrganizationId);
            return this;
        }
        @CustomType.Setter
        public Builder pidOrganizationLevel(Integer pidOrganizationLevel) {
            this.pidOrganizationLevel = Objects.requireNonNull(pidOrganizationLevel);
            return this;
        }
        @CustomType.Setter
        public Builder pidOrganizationName(String pidOrganizationName) {
            this.pidOrganizationName = Objects.requireNonNull(pidOrganizationName);
            return this;
        }
        public GetIndustrialPidOrganizationsOrganization build() {
            final var _resultValue = new GetIndustrialPidOrganizationsOrganization();
            _resultValue.id = id;
            _resultValue.parentPidOrganizationId = parentPidOrganizationId;
            _resultValue.pidOrganizationId = pidOrganizationId;
            _resultValue.pidOrganizationLevel = pidOrganizationLevel;
            _resultValue.pidOrganizationName = pidOrganizationName;
            return _resultValue;
        }
    }
}
