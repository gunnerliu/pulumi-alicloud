// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class MetricRuleTemplateAlertTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The abbreviation of the service name. Valid values: `ecs`, `rds`, `ads`, `slb`, `vpc`, `apigateway`, `cdn`, `cs`, `dcdn`, `ddos`, `eip`, `elasticsearch`, `emr`, `ess`, `hbase`, `iot_edge`, `kvstore_sharding`, `kvstore_splitrw`, `kvstore_standard`, `memcache`, `mns`, `mongodb`, `mongodb_cluster`, `mongodb_sharding`, `mq_topic`, `ocs`, `opensearch`, `oss`, `polardb`, `petadata`, `scdn`, `sharebandwidthpackages`, `sls`, `vpn`.
        /// </summary>
        [Input("category", required: true)]
        public Input<string> Category { get; set; } = null!;

        /// <summary>
        /// The information about the trigger condition based on the alert level. See `escalations` below.
        /// </summary>
        [Input("escalations")]
        public Input<Inputs.MetricRuleTemplateAlertTemplateEscalationsGetArgs>? Escalations { get; set; }

        /// <summary>
        /// The name of the metric.
        /// 
        /// &gt; **NOTE:** For more information, see [DescribeMetricMetaList](https://www.alibabacloud.com/help/doc-detail/98846.htm) or [Appendix 1: Metrics](https://www.alibabacloud.com/help/doc-detail/28619.htm).
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// The namespace of the service.
        /// 
        /// &gt; **NOTE:** For more information, see [DescribeMetricMetaList](https://www.alibabacloud.com/help/doc-detail/98846.htm) or [Appendix 1: Metrics](https://www.alibabacloud.com/help/doc-detail/28619.htm).
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// The name of the alert rule.
        /// </summary>
        [Input("ruleName", required: true)]
        public Input<string> RuleName { get; set; } = null!;

        /// <summary>
        /// The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
        /// </summary>
        [Input("webhook")]
        public Input<string>? Webhook { get; set; }

        public MetricRuleTemplateAlertTemplateGetArgs()
        {
        }
        public static new MetricRuleTemplateAlertTemplateGetArgs Empty => new MetricRuleTemplateAlertTemplateGetArgs();
    }
}
