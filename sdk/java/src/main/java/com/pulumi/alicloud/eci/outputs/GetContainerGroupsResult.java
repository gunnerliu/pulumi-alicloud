// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.alicloud.eci.outputs.GetContainerGroupsGroup;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetContainerGroupsResult {
    private final @Nullable String containerGroupName;
    private final @Nullable Boolean enableDetails;
    private final List<GetContainerGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable Integer limit;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;
    private final @Nullable String resourceGroupId;
    private final @Nullable String status;
    private final @Nullable Map<String,Object> tags;
    private final @Nullable String vswitchId;
    private final @Nullable Boolean withEvent;
    private final @Nullable String zoneId;

    @CustomType.Constructor
    private GetContainerGroupsResult(
        @CustomType.Parameter("containerGroupName") @Nullable String containerGroupName,
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("groups") List<GetContainerGroupsGroup> groups,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("limit") @Nullable Integer limit,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("resourceGroupId") @Nullable String resourceGroupId,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags,
        @CustomType.Parameter("vswitchId") @Nullable String vswitchId,
        @CustomType.Parameter("withEvent") @Nullable Boolean withEvent,
        @CustomType.Parameter("zoneId") @Nullable String zoneId) {
        this.containerGroupName = containerGroupName;
        this.enableDetails = enableDetails;
        this.groups = groups;
        this.id = id;
        this.ids = ids;
        this.limit = limit;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.resourceGroupId = resourceGroupId;
        this.status = status;
        this.tags = tags;
        this.vswitchId = vswitchId;
        this.withEvent = withEvent;
        this.zoneId = zoneId;
    }

    public Optional<String> containerGroupName() {
        return Optional.ofNullable(this.containerGroupName);
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    public List<GetContainerGroupsGroup> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }
    public Optional<Boolean> withEvent() {
        return Optional.ofNullable(this.withEvent);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerGroupName;
        private @Nullable Boolean enableDetails;
        private List<GetContainerGroupsGroup> groups;
        private String id;
        private List<String> ids;
        private @Nullable Integer limit;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String resourceGroupId;
        private @Nullable String status;
        private @Nullable Map<String,Object> tags;
        private @Nullable String vswitchId;
        private @Nullable Boolean withEvent;
        private @Nullable String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerGroupName = defaults.containerGroupName;
    	      this.enableDetails = defaults.enableDetails;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.limit = defaults.limit;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vswitchId = defaults.vswitchId;
    	      this.withEvent = defaults.withEvent;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder containerGroupName(@Nullable String containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder groups(List<GetContainerGroupsGroup> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(GetContainerGroupsGroup... groups) {
            return groups(List.of(groups));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder limit(@Nullable Integer limit) {
            this.limit = limit;
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder vswitchId(@Nullable String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public Builder withEvent(@Nullable Boolean withEvent) {
            this.withEvent = withEvent;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }        public GetContainerGroupsResult build() {
            return new GetContainerGroupsResult(containerGroupName, enableDetails, groups, id, ids, limit, nameRegex, names, outputFile, resourceGroupId, status, tags, vswitchId, withEvent, zoneId);
        }
    }
}
