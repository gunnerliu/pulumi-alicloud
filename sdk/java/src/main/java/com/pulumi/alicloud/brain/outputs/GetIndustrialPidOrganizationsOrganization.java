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
    private final String id;
    /**
     * @return The parent organization id.
     * 
     */
    private final String parentPidOrganizationId;
    /**
     * @return The organization id.
     * 
     */
    private final String pidOrganizationId;
    /**
     * @return The organization level.
     * 
     */
    private final Integer pidOrganizationLevel;
    /**
     * @return The organization name.
     * 
     */
    private final String pidOrganizationName;

    @CustomType.Constructor
    private GetIndustrialPidOrganizationsOrganization(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("parentPidOrganizationId") String parentPidOrganizationId,
        @CustomType.Parameter("pidOrganizationId") String pidOrganizationId,
        @CustomType.Parameter("pidOrganizationLevel") Integer pidOrganizationLevel,
        @CustomType.Parameter("pidOrganizationName") String pidOrganizationName) {
        this.id = id;
        this.parentPidOrganizationId = parentPidOrganizationId;
        this.pidOrganizationId = pidOrganizationId;
        this.pidOrganizationLevel = pidOrganizationLevel;
        this.pidOrganizationName = pidOrganizationName;
    }

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

    public static final class Builder {
        private String id;
        private String parentPidOrganizationId;
        private String pidOrganizationId;
        private Integer pidOrganizationLevel;
        private String pidOrganizationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndustrialPidOrganizationsOrganization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parentPidOrganizationId = defaults.parentPidOrganizationId;
    	      this.pidOrganizationId = defaults.pidOrganizationId;
    	      this.pidOrganizationLevel = defaults.pidOrganizationLevel;
    	      this.pidOrganizationName = defaults.pidOrganizationName;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder parentPidOrganizationId(String parentPidOrganizationId) {
            this.parentPidOrganizationId = Objects.requireNonNull(parentPidOrganizationId);
            return this;
        }
        public Builder pidOrganizationId(String pidOrganizationId) {
            this.pidOrganizationId = Objects.requireNonNull(pidOrganizationId);
            return this;
        }
        public Builder pidOrganizationLevel(Integer pidOrganizationLevel) {
            this.pidOrganizationLevel = Objects.requireNonNull(pidOrganizationLevel);
            return this;
        }
        public Builder pidOrganizationName(String pidOrganizationName) {
            this.pidOrganizationName = Objects.requireNonNull(pidOrganizationName);
            return this;
        }        public GetIndustrialPidOrganizationsOrganization build() {
            return new GetIndustrialPidOrganizationsOrganization(id, parentPidOrganizationId, pidOrganizationId, pidOrganizationLevel, pidOrganizationName);
        }
    }
}
