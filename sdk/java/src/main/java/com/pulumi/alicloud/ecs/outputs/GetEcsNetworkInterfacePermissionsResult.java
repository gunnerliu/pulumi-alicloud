// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetEcsNetworkInterfacePermissionsPermission;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEcsNetworkInterfacePermissionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private String networkInterfaceId;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;
    private List<GetEcsNetworkInterfacePermissionsPermission> permissions;
    private @Nullable String status;
    private Integer totalCount;

    private GetEcsNetworkInterfacePermissionsResult() {}
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
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public List<GetEcsNetworkInterfacePermissionsPermission> permissions() {
        return this.permissions;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsNetworkInterfacePermissionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private String networkInterfaceId;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private List<GetEcsNetworkInterfacePermissionsPermission> permissions;
        private @Nullable String status;
        private Integer totalCount;
        public Builder() {}
        public Builder(GetEcsNetworkInterfacePermissionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.permissions = defaults.permissions;
    	      this.status = defaults.status;
    	      this.totalCount = defaults.totalCount;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(List<GetEcsNetworkInterfacePermissionsPermission> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(GetEcsNetworkInterfacePermissionsPermission... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        public GetEcsNetworkInterfacePermissionsResult build() {
            final var o = new GetEcsNetworkInterfacePermissionsResult();
            o.id = id;
            o.ids = ids;
            o.networkInterfaceId = networkInterfaceId;
            o.outputFile = outputFile;
            o.pageNumber = pageNumber;
            o.pageSize = pageSize;
            o.permissions = permissions;
            o.status = status;
            o.totalCount = totalCount;
            return o;
        }
    }
}
