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


public final class GetBgpPeersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpPeersArgs Empty = new GetBgpPeersArgs();

    /**
     * The ID of the BGP group.
     * 
     */
    @Import(name="bgpGroupId")
    private @Nullable Output<String> bgpGroupId;

    /**
     * @return The ID of the BGP group.
     * 
     */
    public Optional<Output<String>> bgpGroupId() {
        return Optional.ofNullable(this.bgpGroupId);
    }

    /**
     * A list of Bgp Peer IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Bgp Peer IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of the router.
     * 
     */
    @Import(name="routerId")
    private @Nullable Output<String> routerId;

    /**
     * @return The ID of the router.
     * 
     */
    public Optional<Output<String>> routerId() {
        return Optional.ofNullable(this.routerId);
    }

    /**
     * The status of the BGP peer.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the BGP peer.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetBgpPeersArgs() {}

    private GetBgpPeersArgs(GetBgpPeersArgs $) {
        this.bgpGroupId = $.bgpGroupId;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.routerId = $.routerId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpPeersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpPeersArgs $;

        public Builder() {
            $ = new GetBgpPeersArgs();
        }

        public Builder(GetBgpPeersArgs defaults) {
            $ = new GetBgpPeersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bgpGroupId The ID of the BGP group.
         * 
         * @return builder
         * 
         */
        public Builder bgpGroupId(@Nullable Output<String> bgpGroupId) {
            $.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * @param bgpGroupId The ID of the BGP group.
         * 
         * @return builder
         * 
         */
        public Builder bgpGroupId(String bgpGroupId) {
            return bgpGroupId(Output.of(bgpGroupId));
        }

        /**
         * @param ids A list of Bgp Peer IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Bgp Peer IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Bgp Peer IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param routerId The ID of the router.
         * 
         * @return builder
         * 
         */
        public Builder routerId(@Nullable Output<String> routerId) {
            $.routerId = routerId;
            return this;
        }

        /**
         * @param routerId The ID of the router.
         * 
         * @return builder
         * 
         */
        public Builder routerId(String routerId) {
            return routerId(Output.of(routerId));
        }

        /**
         * @param status The status of the BGP peer.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the BGP peer.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetBgpPeersArgs build() {
            return $;
        }
    }

}
