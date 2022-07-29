// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRouteTablesTable {
    /**
     * @return The description of the route table instance.
     * 
     */
    private final String description;
    /**
     * @return ID of the Route Table.
     * 
     */
    private final String id;
    /**
     * @return Name of the route table.
     * 
     */
    private final String name;
    /**
     * @return The Id of resource group which route tables belongs.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return The route table id.
     * 
     */
    private final String routeTableId;
    /**
     * @return The route table name.
     * 
     */
    private final String routeTableName;
    /**
     * @return The type of route table.
     * 
     */
    private final String routeTableType;
    /**
     * @return The router ID.
     * 
     */
    private final String routerId;
    /**
     * @return The route type of route table. Valid values: `VRouter` and `VBR`.
     * 
     */
    private final String routerType;
    /**
     * @return The status of resource. Valid values: `Available` and `Pending`.
     * 
     */
    private final String status;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return Vpc id of the route table.
     * 
     */
    private final String vpcId;
    /**
     * @return A list of vswitch id.
     * 
     */
    private final List<String> vswitchIds;

    @CustomType.Constructor
    private GetRouteTablesTable(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("routeTableId") String routeTableId,
        @CustomType.Parameter("routeTableName") String routeTableName,
        @CustomType.Parameter("routeTableType") String routeTableType,
        @CustomType.Parameter("routerId") String routerId,
        @CustomType.Parameter("routerType") String routerType,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchIds") List<String> vswitchIds) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.resourceGroupId = resourceGroupId;
        this.routeTableId = routeTableId;
        this.routeTableName = routeTableName;
        this.routeTableType = routeTableType;
        this.routerId = routerId;
        this.routerType = routerType;
        this.status = status;
        this.tags = tags;
        this.vpcId = vpcId;
        this.vswitchIds = vswitchIds;
    }

    /**
     * @return The description of the route table instance.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the Route Table.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the route table.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Id of resource group which route tables belongs.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The route table id.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }
    /**
     * @return The route table name.
     * 
     */
    public String routeTableName() {
        return this.routeTableName;
    }
    /**
     * @return The type of route table.
     * 
     */
    public String routeTableType() {
        return this.routeTableType;
    }
    /**
     * @return The router ID.
     * 
     */
    public String routerId() {
        return this.routerId;
    }
    /**
     * @return The route type of route table. Valid values: `VRouter` and `VBR`.
     * 
     */
    public String routerType() {
        return this.routerType;
    }
    /**
     * @return The status of resource. Valid values: `Available` and `Pending`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return Vpc id of the route table.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return A list of vswitch id.
     * 
     */
    public List<String> vswitchIds() {
        return this.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTablesTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String resourceGroupId;
        private String routeTableId;
        private String routeTableName;
        private String routeTableType;
        private String routerId;
        private String routerType;
        private String status;
        private Map<String,Object> tags;
        private String vpcId;
        private List<String> vswitchIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteTablesTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.routeTableName = defaults.routeTableName;
    	      this.routeTableType = defaults.routeTableType;
    	      this.routerId = defaults.routerId;
    	      this.routerType = defaults.routerType;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchIds = defaults.vswitchIds;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        public Builder routeTableName(String routeTableName) {
            this.routeTableName = Objects.requireNonNull(routeTableName);
            return this;
        }
        public Builder routeTableType(String routeTableType) {
            this.routeTableType = Objects.requireNonNull(routeTableType);
            return this;
        }
        public Builder routerId(String routerId) {
            this.routerId = Objects.requireNonNull(routerId);
            return this;
        }
        public Builder routerType(String routerType) {
            this.routerType = Objects.requireNonNull(routerType);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vswitchIds(List<String> vswitchIds) {
            this.vswitchIds = Objects.requireNonNull(vswitchIds);
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }        public GetRouteTablesTable build() {
            return new GetRouteTablesTable(description, id, name, resourceGroupId, routeTableId, routeTableName, routeTableType, routerId, routerType, status, tags, vpcId, vswitchIds);
        }
    }
}
