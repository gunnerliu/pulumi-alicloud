// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetRouterInterfacesInterface;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouterInterfacesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of router interface IDs.
     * 
     */
    private List<String> ids;
    /**
     * @return A list of router interfaces. Each element contains the following attributes:
     * 
     */
    private List<GetRouterInterfacesInterface> interfaces;
    private @Nullable String nameRegex;
    /**
     * @return A list of router interface names.
     * 
     */
    private List<String> names;
    /**
     * @return Peer router interface ID.
     * 
     */
    private @Nullable String oppositeInterfaceId;
    /**
     * @return Account ID of the owner of the peer router interface.
     * 
     */
    private @Nullable String oppositeInterfaceOwnerId;
    private @Nullable String outputFile;
    /**
     * @return Router interface role. Possible values: `InitiatingSide` and `AcceptingSide`.
     * 
     */
    private @Nullable String role;
    /**
     * @return ID of the VRouter located in the local region.
     * 
     */
    private @Nullable String routerId;
    /**
     * @return Router type in the local region. Possible values: `VRouter` and `VBR`.
     * 
     */
    private @Nullable String routerType;
    /**
     * @return Router interface specification. Possible values: `Small.1`, `Middle.1`, `Large.2`, ...etc.
     * 
     */
    private @Nullable String specification;
    /**
     * @return Router interface status. Possible values: `Active`, `Inactive` and `Idle`.
     * 
     */
    private @Nullable String status;

    private GetRouterInterfacesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of router interface IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return A list of router interfaces. Each element contains the following attributes:
     * 
     */
    public List<GetRouterInterfacesInterface> interfaces() {
        return this.interfaces;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of router interface names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    /**
     * @return Peer router interface ID.
     * 
     */
    public Optional<String> oppositeInterfaceId() {
        return Optional.ofNullable(this.oppositeInterfaceId);
    }
    /**
     * @return Account ID of the owner of the peer router interface.
     * 
     */
    public Optional<String> oppositeInterfaceOwnerId() {
        return Optional.ofNullable(this.oppositeInterfaceOwnerId);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return Router interface role. Possible values: `InitiatingSide` and `AcceptingSide`.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * @return ID of the VRouter located in the local region.
     * 
     */
    public Optional<String> routerId() {
        return Optional.ofNullable(this.routerId);
    }
    /**
     * @return Router type in the local region. Possible values: `VRouter` and `VBR`.
     * 
     */
    public Optional<String> routerType() {
        return Optional.ofNullable(this.routerType);
    }
    /**
     * @return Router interface specification. Possible values: `Small.1`, `Middle.1`, `Large.2`, ...etc.
     * 
     */
    public Optional<String> specification() {
        return Optional.ofNullable(this.specification);
    }
    /**
     * @return Router interface status. Possible values: `Active`, `Inactive` and `Idle`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterInterfacesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private List<GetRouterInterfacesInterface> interfaces;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String oppositeInterfaceId;
        private @Nullable String oppositeInterfaceOwnerId;
        private @Nullable String outputFile;
        private @Nullable String role;
        private @Nullable String routerId;
        private @Nullable String routerType;
        private @Nullable String specification;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetRouterInterfacesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.interfaces = defaults.interfaces;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.oppositeInterfaceId = defaults.oppositeInterfaceId;
    	      this.oppositeInterfaceOwnerId = defaults.oppositeInterfaceOwnerId;
    	      this.outputFile = defaults.outputFile;
    	      this.role = defaults.role;
    	      this.routerId = defaults.routerId;
    	      this.routerType = defaults.routerType;
    	      this.specification = defaults.specification;
    	      this.status = defaults.status;
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
        public Builder interfaces(List<GetRouterInterfacesInterface> interfaces) {
            this.interfaces = Objects.requireNonNull(interfaces);
            return this;
        }
        public Builder interfaces(GetRouterInterfacesInterface... interfaces) {
            return interfaces(List.of(interfaces));
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
        public Builder oppositeInterfaceId(@Nullable String oppositeInterfaceId) {
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder oppositeInterfaceOwnerId(@Nullable String oppositeInterfaceOwnerId) {
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder routerId(@Nullable String routerId) {
            this.routerId = routerId;
            return this;
        }
        @CustomType.Setter
        public Builder routerType(@Nullable String routerType) {
            this.routerType = routerType;
            return this;
        }
        @CustomType.Setter
        public Builder specification(@Nullable String specification) {
            this.specification = specification;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetRouterInterfacesResult build() {
            final var _resultValue = new GetRouterInterfacesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.interfaces = interfaces;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.oppositeInterfaceId = oppositeInterfaceId;
            _resultValue.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            _resultValue.outputFile = outputFile;
            _resultValue.role = role;
            _resultValue.routerId = routerId;
            _resultValue.routerType = routerType;
            _resultValue.specification = specification;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
