// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetEcsSnapshotGroupsGroup {
    /**
     * @return The description of the snapshot-consistent group.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Snapshot Group.
     * 
     */
    private final String id;
    /**
     * @return The ID of the instance.
     * 
     */
    private final String instanceId;
    /**
     * @return The ID of the resource group to which the snapshot consistency group belongs.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return The first ID of the resource.
     * 
     */
    private final String snapshotGroupId;
    /**
     * @return The name of the snapshot-consistent group.
     * 
     */
    private final String snapshotGroupName;
    /**
     * @return The status of the resource.
     * 
     */
    private final String status;
    /**
     * @return List of label key-value pairs.
     * 
     */
    private final @Nullable Map<String,Object> tags;

    @CustomType.Constructor
    private GetEcsSnapshotGroupsGroup(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("snapshotGroupId") String snapshotGroupId,
        @CustomType.Parameter("snapshotGroupName") String snapshotGroupName,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags) {
        this.description = description;
        this.id = id;
        this.instanceId = instanceId;
        this.resourceGroupId = resourceGroupId;
        this.snapshotGroupId = snapshotGroupId;
        this.snapshotGroupName = snapshotGroupName;
        this.status = status;
        this.tags = tags;
    }

    /**
     * @return The description of the snapshot-consistent group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Snapshot Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The ID of the resource group to which the snapshot consistency group belongs.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String snapshotGroupId() {
        return this.snapshotGroupId;
    }
    /**
     * @return The name of the snapshot-consistent group.
     * 
     */
    public String snapshotGroupName() {
        return this.snapshotGroupName;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return List of label key-value pairs.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsSnapshotGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String instanceId;
        private String resourceGroupId;
        private String snapshotGroupId;
        private String snapshotGroupName;
        private String status;
        private @Nullable Map<String,Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsSnapshotGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.snapshotGroupId = defaults.snapshotGroupId;
    	      this.snapshotGroupName = defaults.snapshotGroupName;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder snapshotGroupId(String snapshotGroupId) {
            this.snapshotGroupId = Objects.requireNonNull(snapshotGroupId);
            return this;
        }
        public Builder snapshotGroupName(String snapshotGroupName) {
            this.snapshotGroupName = Objects.requireNonNull(snapshotGroupName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }        public GetEcsSnapshotGroupsGroup build() {
            return new GetEcsSnapshotGroupsGroup(description, id, instanceId, resourceGroupId, snapshotGroupId, snapshotGroupName, status, tags);
        }
    }
}
