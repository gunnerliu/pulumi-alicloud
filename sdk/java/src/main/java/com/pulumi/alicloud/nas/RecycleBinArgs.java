// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecycleBinArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecycleBinArgs Empty = new RecycleBinArgs();

    /**
     * The ID of the file system for which you want to enable the recycle bin feature.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private Output<String> fileSystemId;

    /**
     * @return The ID of the file system for which you want to enable the recycle bin feature.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
     * 
     */
    @Import(name="reservedDays")
    private @Nullable Output<Integer> reservedDays;

    /**
     * @return The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
     * 
     */
    public Optional<Output<Integer>> reservedDays() {
        return Optional.ofNullable(this.reservedDays);
    }

    private RecycleBinArgs() {}

    private RecycleBinArgs(RecycleBinArgs $) {
        this.fileSystemId = $.fileSystemId;
        this.reservedDays = $.reservedDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecycleBinArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecycleBinArgs $;

        public Builder() {
            $ = new RecycleBinArgs();
        }

        public Builder(RecycleBinArgs defaults) {
            $ = new RecycleBinArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileSystemId The ID of the file system for which you want to enable the recycle bin feature.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * @param fileSystemId The ID of the file system for which you want to enable the recycle bin feature.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        /**
         * @param reservedDays The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
         * 
         * @return builder
         * 
         */
        public Builder reservedDays(@Nullable Output<Integer> reservedDays) {
            $.reservedDays = reservedDays;
            return this;
        }

        /**
         * @param reservedDays The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
         * 
         * @return builder
         * 
         */
        public Builder reservedDays(Integer reservedDays) {
            return reservedDays(Output.of(reservedDays));
        }

        public RecycleBinArgs build() {
            $.fileSystemId = Objects.requireNonNull($.fileSystemId, "expected parameter 'fileSystemId' to be non-null");
            return $;
        }
    }

}
