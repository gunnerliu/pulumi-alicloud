// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerGroupServerAttachmentsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerGroupServerAttachmentsArgs Empty = new GetServerGroupServerAttachmentsArgs();

    /**
     * A list of Server Group Server Attachment IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Server Group Server Attachment IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of the server group.
     * 
     */
    @Import(name="serverGroupId")
    private @Nullable Output<String> serverGroupId;

    /**
     * @return The ID of the server group.
     * 
     */
    public Optional<Output<String>> serverGroupId() {
        return Optional.ofNullable(this.serverGroupId);
    }

    /**
     * The IDs of the servers. You can specify at most 40 server IDs in each call.
     * 
     */
    @Import(name="serverIds")
    private @Nullable Output<List<String>> serverIds;

    /**
     * @return The IDs of the servers. You can specify at most 40 server IDs in each call.
     * 
     */
    public Optional<Output<List<String>>> serverIds() {
        return Optional.ofNullable(this.serverIds);
    }

    /**
     * The IP addresses of the servers. You can specify at most 40 server IP addresses in each call.
     * 
     */
    @Import(name="serverIps")
    private @Nullable Output<List<String>> serverIps;

    /**
     * @return The IP addresses of the servers. You can specify at most 40 server IP addresses in each call.
     * 
     */
    public Optional<Output<List<String>>> serverIps() {
        return Optional.ofNullable(this.serverIps);
    }

    private GetServerGroupServerAttachmentsArgs() {}

    private GetServerGroupServerAttachmentsArgs(GetServerGroupServerAttachmentsArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.serverGroupId = $.serverGroupId;
        this.serverIds = $.serverIds;
        this.serverIps = $.serverIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerGroupServerAttachmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerGroupServerAttachmentsArgs $;

        public Builder() {
            $ = new GetServerGroupServerAttachmentsArgs();
        }

        public Builder(GetServerGroupServerAttachmentsArgs defaults) {
            $ = new GetServerGroupServerAttachmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Server Group Server Attachment IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Server Group Server Attachment IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Server Group Server Attachment IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param serverGroupId The ID of the server group.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupId(@Nullable Output<String> serverGroupId) {
            $.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * @param serverGroupId The ID of the server group.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupId(String serverGroupId) {
            return serverGroupId(Output.of(serverGroupId));
        }

        /**
         * @param serverIds The IDs of the servers. You can specify at most 40 server IDs in each call.
         * 
         * @return builder
         * 
         */
        public Builder serverIds(@Nullable Output<List<String>> serverIds) {
            $.serverIds = serverIds;
            return this;
        }

        /**
         * @param serverIds The IDs of the servers. You can specify at most 40 server IDs in each call.
         * 
         * @return builder
         * 
         */
        public Builder serverIds(List<String> serverIds) {
            return serverIds(Output.of(serverIds));
        }

        /**
         * @param serverIds The IDs of the servers. You can specify at most 40 server IDs in each call.
         * 
         * @return builder
         * 
         */
        public Builder serverIds(String... serverIds) {
            return serverIds(List.of(serverIds));
        }

        /**
         * @param serverIps The IP addresses of the servers. You can specify at most 40 server IP addresses in each call.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(@Nullable Output<List<String>> serverIps) {
            $.serverIps = serverIps;
            return this;
        }

        /**
         * @param serverIps The IP addresses of the servers. You can specify at most 40 server IP addresses in each call.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(List<String> serverIps) {
            return serverIps(Output.of(serverIps));
        }

        /**
         * @param serverIps The IP addresses of the servers. You can specify at most 40 server IP addresses in each call.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(String... serverIps) {
            return serverIps(List.of(serverIps));
        }

        public GetServerGroupServerAttachmentsArgs build() {
            return $;
        }
    }

}
