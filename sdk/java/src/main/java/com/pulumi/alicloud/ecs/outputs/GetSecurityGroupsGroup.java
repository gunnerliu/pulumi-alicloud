// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityGroupsGroup {
    /**
     * @return Creation time of the security group.
     * 
     */
    private final String creationTime;
    /**
     * @return The description of the security group.
     * 
     */
    private final String description;
    /**
     * @return The ID of the security group.
     * 
     */
    private final String id;
    /**
     * @return Whether to allow inner network access.
     * 
     */
    private final Boolean innerAccess;
    /**
     * @return The name of the security group.
     * 
     */
    private final String name;
    /**
     * @return The Id of resource group which the security_group belongs.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return The type of the security group.
     * 
     */
    private final String securityGroupType;
    /**
     * @return A map of tags assigned to the ECS instances. It must be in the format:
     * 
     */
    private final @Nullable Map<String,Object> tags;
    /**
     * @return Used to retrieve security groups that belong to the specified VPC ID.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetSecurityGroupsGroup(
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("innerAccess") Boolean innerAccess,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("securityGroupType") String securityGroupType,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.creationTime = creationTime;
        this.description = description;
        this.id = id;
        this.innerAccess = innerAccess;
        this.name = name;
        this.resourceGroupId = resourceGroupId;
        this.securityGroupType = securityGroupType;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    /**
     * @return Creation time of the security group.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The description of the security group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the security group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether to allow inner network access.
     * 
     */
    public Boolean innerAccess() {
        return this.innerAccess;
    }
    /**
     * @return The name of the security group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Id of resource group which the security_group belongs.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The type of the security group.
     * 
     */
    public String securityGroupType() {
        return this.securityGroupType;
    }
    /**
     * @return A map of tags assigned to the ECS instances. It must be in the format:
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Used to retrieve security groups that belong to the specified VPC ID.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String description;
        private String id;
        private Boolean innerAccess;
        private String name;
        private String resourceGroupId;
        private String securityGroupType;
        private @Nullable Map<String,Object> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.innerAccess = defaults.innerAccess;
    	      this.name = defaults.name;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.securityGroupType = defaults.securityGroupType;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder innerAccess(Boolean innerAccess) {
            this.innerAccess = Objects.requireNonNull(innerAccess);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder securityGroupType(String securityGroupType) {
            this.securityGroupType = Objects.requireNonNull(securityGroupType);
            return this;
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetSecurityGroupsGroup build() {
            return new GetSecurityGroupsGroup(creationTime, description, id, innerAccess, name, resourceGroupId, securityGroupType, tags, vpcId);
        }
    }
}
