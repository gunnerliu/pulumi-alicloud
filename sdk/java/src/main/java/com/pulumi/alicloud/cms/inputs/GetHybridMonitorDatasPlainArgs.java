// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHybridMonitorDatasPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHybridMonitorDatasPlainArgs Empty = new GetHybridMonitorDatasPlainArgs();

    /**
     * The timestamp that specifies the end of the time range to query.
     * 
     */
    @Import(name="end", required=true)
    private String end;

    /**
     * @return The timestamp that specifies the end of the time range to query.
     * 
     */
    public String end() {
        return this.end;
    }

    /**
     * The name of the namespace.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The name of the namespace.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The interval at which monitoring data is collected. Unit: seconds.
     * 
     */
    @Import(name="period")
    private @Nullable String period;

    /**
     * @return The interval at which monitoring data is collected. Unit: seconds.
     * 
     */
    public Optional<String> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The name of the metric. Note PromQL statements are supported.
     * 
     */
    @Import(name="promSql", required=true)
    private String promSql;

    /**
     * @return The name of the metric. Note PromQL statements are supported.
     * 
     */
    public String promSql() {
        return this.promSql;
    }

    /**
     * The timestamp that specifies the beginning of the time range to query.
     * 
     */
    @Import(name="start", required=true)
    private String start;

    /**
     * @return The timestamp that specifies the beginning of the time range to query.
     * 
     */
    public String start() {
        return this.start;
    }

    private GetHybridMonitorDatasPlainArgs() {}

    private GetHybridMonitorDatasPlainArgs(GetHybridMonitorDatasPlainArgs $) {
        this.end = $.end;
        this.namespace = $.namespace;
        this.outputFile = $.outputFile;
        this.period = $.period;
        this.promSql = $.promSql;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHybridMonitorDatasPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHybridMonitorDatasPlainArgs $;

        public Builder() {
            $ = new GetHybridMonitorDatasPlainArgs();
        }

        public Builder(GetHybridMonitorDatasPlainArgs defaults) {
            $ = new GetHybridMonitorDatasPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param end The timestamp that specifies the end of the time range to query.
         * 
         * @return builder
         * 
         */
        public Builder end(String end) {
            $.end = end;
            return this;
        }

        /**
         * @param namespace The name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param period The interval at which monitoring data is collected. Unit: seconds.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable String period) {
            $.period = period;
            return this;
        }

        /**
         * @param promSql The name of the metric. Note PromQL statements are supported.
         * 
         * @return builder
         * 
         */
        public Builder promSql(String promSql) {
            $.promSql = promSql;
            return this;
        }

        /**
         * @param start The timestamp that specifies the beginning of the time range to query.
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            $.start = start;
            return this;
        }

        public GetHybridMonitorDatasPlainArgs build() {
            $.end = Objects.requireNonNull($.end, "expected parameter 'end' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.promSql = Objects.requireNonNull($.promSql, "expected parameter 'promSql' to be non-null");
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
