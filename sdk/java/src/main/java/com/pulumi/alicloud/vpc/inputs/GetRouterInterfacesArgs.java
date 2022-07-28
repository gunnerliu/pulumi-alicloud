// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouterInterfacesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouterInterfacesArgs Empty = new GetRouterInterfacesArgs();

    /**
     * A list of router interface IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of router interface IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string used to filter by router interface name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string used to filter by router interface name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * ID of the peer router interface.
     * 
     */
    @Import(name="oppositeInterfaceId")
    private @Nullable Output<String> oppositeInterfaceId;

    /**
     * @return ID of the peer router interface.
     * 
     */
    public Optional<Output<String>> oppositeInterfaceId() {
        return Optional.ofNullable(this.oppositeInterfaceId);
    }

    /**
     * Account ID of the owner of the peer router interface.
     * 
     */
    @Import(name="oppositeInterfaceOwnerId")
    private @Nullable Output<String> oppositeInterfaceOwnerId;

    /**
     * @return Account ID of the owner of the peer router interface.
     * 
     */
    public Optional<Output<String>> oppositeInterfaceOwnerId() {
        return Optional.ofNullable(this.oppositeInterfaceOwnerId);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and
     * `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and
     * `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * ID of the VRouter located in the local region.
     * 
     */
    @Import(name="routerId")
    private @Nullable Output<String> routerId;

    /**
     * @return ID of the VRouter located in the local region.
     * 
     */
    public Optional<Output<String>> routerId() {
        return Optional.ofNullable(this.routerId);
    }

    /**
     * Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
     * 
     */
    @Import(name="routerType")
    private @Nullable Output<String> routerType;

    /**
     * @return Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
     * 
     */
    public Optional<Output<String>> routerType() {
        return Optional.ofNullable(this.routerType);
    }

    /**
     * Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
     * 
     */
    @Import(name="specification")
    private @Nullable Output<String> specification;

    /**
     * @return Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
     * 
     */
    public Optional<Output<String>> specification() {
        return Optional.ofNullable(this.specification);
    }

    /**
     * Expected status. Valid values are `Active`, `Inactive` and `Idle`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Expected status. Valid values are `Active`, `Inactive` and `Idle`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetRouterInterfacesArgs() {}

    private GetRouterInterfacesArgs(GetRouterInterfacesArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.oppositeInterfaceId = $.oppositeInterfaceId;
        this.oppositeInterfaceOwnerId = $.oppositeInterfaceOwnerId;
        this.outputFile = $.outputFile;
        this.role = $.role;
        this.routerId = $.routerId;
        this.routerType = $.routerType;
        this.specification = $.specification;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouterInterfacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouterInterfacesArgs $;

        public Builder() {
            $ = new GetRouterInterfacesArgs();
        }

        public Builder(GetRouterInterfacesArgs defaults) {
            $ = new GetRouterInterfacesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of router interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of router interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of router interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string used to filter by router interface name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string used to filter by router interface name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param oppositeInterfaceId ID of the peer router interface.
         * 
         * @return builder
         * 
         */
        public Builder oppositeInterfaceId(@Nullable Output<String> oppositeInterfaceId) {
            $.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }

        /**
         * @param oppositeInterfaceId ID of the peer router interface.
         * 
         * @return builder
         * 
         */
        public Builder oppositeInterfaceId(String oppositeInterfaceId) {
            return oppositeInterfaceId(Output.of(oppositeInterfaceId));
        }

        /**
         * @param oppositeInterfaceOwnerId Account ID of the owner of the peer router interface.
         * 
         * @return builder
         * 
         */
        public Builder oppositeInterfaceOwnerId(@Nullable Output<String> oppositeInterfaceOwnerId) {
            $.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }

        /**
         * @param oppositeInterfaceOwnerId Account ID of the owner of the peer router interface.
         * 
         * @return builder
         * 
         */
        public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            return oppositeInterfaceOwnerId(Output.of(oppositeInterfaceOwnerId));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param role Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and
         * `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and
         * `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param routerId ID of the VRouter located in the local region.
         * 
         * @return builder
         * 
         */
        public Builder routerId(@Nullable Output<String> routerId) {
            $.routerId = routerId;
            return this;
        }

        /**
         * @param routerId ID of the VRouter located in the local region.
         * 
         * @return builder
         * 
         */
        public Builder routerId(String routerId) {
            return routerId(Output.of(routerId));
        }

        /**
         * @param routerType Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
         * 
         * @return builder
         * 
         */
        public Builder routerType(@Nullable Output<String> routerType) {
            $.routerType = routerType;
            return this;
        }

        /**
         * @param routerType Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
         * 
         * @return builder
         * 
         */
        public Builder routerType(String routerType) {
            return routerType(Output.of(routerType));
        }

        /**
         * @param specification Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
         * 
         * @return builder
         * 
         */
        public Builder specification(@Nullable Output<String> specification) {
            $.specification = specification;
            return this;
        }

        /**
         * @param specification Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
         * 
         * @return builder
         * 
         */
        public Builder specification(String specification) {
            return specification(Output.of(specification));
        }

        /**
         * @param status Expected status. Valid values are `Active`, `Inactive` and `Idle`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Expected status. Valid values are `Active`, `Inactive` and `Idle`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetRouterInterfacesArgs build() {
            return $;
        }
    }

}
