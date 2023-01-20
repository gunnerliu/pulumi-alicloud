// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect.outputs;

import com.pulumi.alicloud.expressconnect.outputs.GetVirtualPhysicalConnectionsConnection;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualPhysicalConnectionsResult {
    /**
     * @return The commercial status of the physical line. Value:-**Normal**: activated.-**Financialized**: Arrears locked.-**SecurityLocked**: locked for security reasons.
     * 
     */
    private @Nullable String businessStatus;
    /**
     * @return A list of Virtual Physical Connection Entries. Each element contains the following attributes:
     * 
     */
    private List<GetVirtualPhysicalConnectionsConnection> connections;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of Virtual Physical Connection IDs.
     * 
     */
    private List<String> ids;
    private @Nullable Boolean isConfirmed;
    private @Nullable String nameRegex;
    /**
     * @return A list of name of Virtual Physical Connections.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return The ID of the instance of the physical connection.
     * 
     */
    private @Nullable String parentPhysicalConnectionId;
    private @Nullable List<String> virtualPhysicalConnectionIds;
    /**
     * @return The business status of the shared line. Value:-**Confirmed**: The shared line has been Confirmed to receive.-**UnConfirmed**: The shared line has not been confirmed to be received.-**Deleted**: The shared line has been Deleted.
     * 
     */
    private @Nullable String virtualPhysicalConnectionStatus;
    private @Nullable List<Integer> vlanIds;
    /**
     * @return The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     * 
     */
    private @Nullable String vpconnAliUid;

    private GetVirtualPhysicalConnectionsResult() {}
    /**
     * @return The commercial status of the physical line. Value:-**Normal**: activated.-**Financialized**: Arrears locked.-**SecurityLocked**: locked for security reasons.
     * 
     */
    public Optional<String> businessStatus() {
        return Optional.ofNullable(this.businessStatus);
    }
    /**
     * @return A list of Virtual Physical Connection Entries. Each element contains the following attributes:
     * 
     */
    public List<GetVirtualPhysicalConnectionsConnection> connections() {
        return this.connections;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Virtual Physical Connection IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<Boolean> isConfirmed() {
        return Optional.ofNullable(this.isConfirmed);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of name of Virtual Physical Connections.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The ID of the instance of the physical connection.
     * 
     */
    public Optional<String> parentPhysicalConnectionId() {
        return Optional.ofNullable(this.parentPhysicalConnectionId);
    }
    public List<String> virtualPhysicalConnectionIds() {
        return this.virtualPhysicalConnectionIds == null ? List.of() : this.virtualPhysicalConnectionIds;
    }
    /**
     * @return The business status of the shared line. Value:-**Confirmed**: The shared line has been Confirmed to receive.-**UnConfirmed**: The shared line has not been confirmed to be received.-**Deleted**: The shared line has been Deleted.
     * 
     */
    public Optional<String> virtualPhysicalConnectionStatus() {
        return Optional.ofNullable(this.virtualPhysicalConnectionStatus);
    }
    public List<Integer> vlanIds() {
        return this.vlanIds == null ? List.of() : this.vlanIds;
    }
    /**
     * @return The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     * 
     */
    public Optional<String> vpconnAliUid() {
        return Optional.ofNullable(this.vpconnAliUid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualPhysicalConnectionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String businessStatus;
        private List<GetVirtualPhysicalConnectionsConnection> connections;
        private String id;
        private List<String> ids;
        private @Nullable Boolean isConfirmed;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String parentPhysicalConnectionId;
        private @Nullable List<String> virtualPhysicalConnectionIds;
        private @Nullable String virtualPhysicalConnectionStatus;
        private @Nullable List<Integer> vlanIds;
        private @Nullable String vpconnAliUid;
        public Builder() {}
        public Builder(GetVirtualPhysicalConnectionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.businessStatus = defaults.businessStatus;
    	      this.connections = defaults.connections;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.isConfirmed = defaults.isConfirmed;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.parentPhysicalConnectionId = defaults.parentPhysicalConnectionId;
    	      this.virtualPhysicalConnectionIds = defaults.virtualPhysicalConnectionIds;
    	      this.virtualPhysicalConnectionStatus = defaults.virtualPhysicalConnectionStatus;
    	      this.vlanIds = defaults.vlanIds;
    	      this.vpconnAliUid = defaults.vpconnAliUid;
        }

        @CustomType.Setter
        public Builder businessStatus(@Nullable String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        @CustomType.Setter
        public Builder connections(List<GetVirtualPhysicalConnectionsConnection> connections) {
            this.connections = Objects.requireNonNull(connections);
            return this;
        }
        public Builder connections(GetVirtualPhysicalConnectionsConnection... connections) {
            return connections(List.of(connections));
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
        public Builder isConfirmed(@Nullable Boolean isConfirmed) {
            this.isConfirmed = isConfirmed;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder parentPhysicalConnectionId(@Nullable String parentPhysicalConnectionId) {
            this.parentPhysicalConnectionId = parentPhysicalConnectionId;
            return this;
        }
        @CustomType.Setter
        public Builder virtualPhysicalConnectionIds(@Nullable List<String> virtualPhysicalConnectionIds) {
            this.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
            return this;
        }
        public Builder virtualPhysicalConnectionIds(String... virtualPhysicalConnectionIds) {
            return virtualPhysicalConnectionIds(List.of(virtualPhysicalConnectionIds));
        }
        @CustomType.Setter
        public Builder virtualPhysicalConnectionStatus(@Nullable String virtualPhysicalConnectionStatus) {
            this.virtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
            return this;
        }
        @CustomType.Setter
        public Builder vlanIds(@Nullable List<Integer> vlanIds) {
            this.vlanIds = vlanIds;
            return this;
        }
        public Builder vlanIds(Integer... vlanIds) {
            return vlanIds(List.of(vlanIds));
        }
        @CustomType.Setter
        public Builder vpconnAliUid(@Nullable String vpconnAliUid) {
            this.vpconnAliUid = vpconnAliUid;
            return this;
        }
        public GetVirtualPhysicalConnectionsResult build() {
            final var o = new GetVirtualPhysicalConnectionsResult();
            o.businessStatus = businessStatus;
            o.connections = connections;
            o.id = id;
            o.ids = ids;
            o.isConfirmed = isConfirmed;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.parentPhysicalConnectionId = parentPhysicalConnectionId;
            o.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
            o.virtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
            o.vlanIds = vlanIds;
            o.vpconnAliUid = vpconnAliUid;
            return o;
        }
    }
}
