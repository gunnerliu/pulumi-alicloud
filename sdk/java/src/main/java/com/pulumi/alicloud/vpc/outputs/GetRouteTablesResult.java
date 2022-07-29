// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetRouteTablesTable;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouteTablesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Optional) A list of Route Tables IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of Route Tables names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    private final @Nullable Integer pageNumber;
    private final @Nullable Integer pageSize;
    /**
     * @return The Id of resource group which route tables belongs.
     * 
     */
    private final @Nullable String resourceGroupId;
    /**
     * @return The route table name.
     * 
     */
    private final @Nullable String routeTableName;
    /**
     * @return Router Id of the route table.
     * 
     */
    private final @Nullable String routerId;
    /**
     * @return The route type.
     * 
     */
    private final @Nullable String routerType;
    /**
     * @return The status of route table.
     * 
     */
    private final @Nullable String status;
    /**
     * @return A list of Route Tables. Each element contains the following attributes:
     * 
     */
    private final List<GetRouteTablesTable> tables;
    private final @Nullable Map<String,Object> tags;
    private final Integer totalCount;
    /**
     * @return The VPC ID.
     * 
     */
    private final @Nullable String vpcId;

    @CustomType.Constructor
    private GetRouteTablesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pageNumber") @Nullable Integer pageNumber,
        @CustomType.Parameter("pageSize") @Nullable Integer pageSize,
        @CustomType.Parameter("resourceGroupId") @Nullable String resourceGroupId,
        @CustomType.Parameter("routeTableName") @Nullable String routeTableName,
        @CustomType.Parameter("routerId") @Nullable String routerId,
        @CustomType.Parameter("routerType") @Nullable String routerType,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("tables") List<GetRouteTablesTable> tables,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags,
        @CustomType.Parameter("totalCount") Integer totalCount,
        @CustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.resourceGroupId = resourceGroupId;
        this.routeTableName = routeTableName;
        this.routerId = routerId;
        this.routerType = routerType;
        this.status = status;
        this.tables = tables;
        this.tags = tags;
        this.totalCount = totalCount;
        this.vpcId = vpcId;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional) A list of Route Tables IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Route Tables names.
     * 
     */
    public List<String> names() {
        return this.names;
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
    /**
     * @return The Id of resource group which route tables belongs.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    /**
     * @return The route table name.
     * 
     */
    public Optional<String> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }
    /**
     * @return Router Id of the route table.
     * 
     */
    public Optional<String> routerId() {
        return Optional.ofNullable(this.routerId);
    }
    /**
     * @return The route type.
     * 
     */
    public Optional<String> routerType() {
        return Optional.ofNullable(this.routerType);
    }
    /**
     * @return The status of route table.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return A list of Route Tables. Each element contains the following attributes:
     * 
     */
    public List<GetRouteTablesTable> tables() {
        return this.tables;
    }
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Integer totalCount() {
        return this.totalCount;
    }
    /**
     * @return The VPC ID.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTablesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String resourceGroupId;
        private @Nullable String routeTableName;
        private @Nullable String routerId;
        private @Nullable String routerType;
        private @Nullable String status;
        private List<GetRouteTablesTable> tables;
        private @Nullable Map<String,Object> tags;
        private Integer totalCount;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteTablesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.routeTableName = defaults.routeTableName;
    	      this.routerId = defaults.routerId;
    	      this.routerType = defaults.routerType;
    	      this.status = defaults.status;
    	      this.tables = defaults.tables;
    	      this.tags = defaults.tags;
    	      this.totalCount = defaults.totalCount;
    	      this.vpcId = defaults.vpcId;
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
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Builder routeTableName(@Nullable String routeTableName) {
            this.routeTableName = routeTableName;
            return this;
        }
        public Builder routerId(@Nullable String routerId) {
            this.routerId = routerId;
            return this;
        }
        public Builder routerType(@Nullable String routerType) {
            this.routerType = routerType;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder tables(List<GetRouteTablesTable> tables) {
            this.tables = Objects.requireNonNull(tables);
            return this;
        }
        public Builder tables(GetRouteTablesTable... tables) {
            return tables(List.of(tables));
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public GetRouteTablesResult build() {
            return new GetRouteTablesResult(id, ids, nameRegex, names, outputFile, pageNumber, pageSize, resourceGroupId, routeTableName, routerId, routerType, status, tables, tags, totalCount, vpcId);
        }
    }
}
