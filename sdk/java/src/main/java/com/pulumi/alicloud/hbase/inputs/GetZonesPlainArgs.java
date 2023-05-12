// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbase.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetZonesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZonesPlainArgs Empty = new GetZonesPlainArgs();

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetZonesPlainArgs() {}

    private GetZonesPlainArgs(GetZonesPlainArgs $) {
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZonesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZonesPlainArgs $;

        public Builder() {
            $ = new GetZonesPlainArgs();
        }

        public Builder(GetZonesPlainArgs defaults) {
            $ = new GetZonesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetZonesPlainArgs build() {
            return $;
        }
    }

}
