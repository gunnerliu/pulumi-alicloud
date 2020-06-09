// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ
{
    /// <summary>
    /// Provides a Sag qos car resource. 
    /// You need to create a QoS car to set priorities, rate limits, and quintuple rules for different messages.
    /// 
    /// For information about Sag Qos Car and how to use it, see [What is Qos Car](https://www.alibabacloud.com/help/doc-detail/140065.htm).
    /// 
    /// &gt; **NOTE:** Available in 1.60.0+
    /// 
    /// &gt; **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var defaultQos = new AliCloud.RocketMQ.Qos("defaultQos", new AliCloud.RocketMQ.QosArgs
    ///         {
    ///         });
    ///         var defaultQosCar = new AliCloud.RocketMQ.QosCar("defaultQosCar", new AliCloud.RocketMQ.QosCarArgs
    ///         {
    ///             Description = "tf-testSagQosCarDescription",
    ///             LimitType = "Absolute",
    ///             MaxBandwidthAbs = 20,
    ///             MaxBandwidthPercent = 20,
    ///             MinBandwidthAbs = 10,
    ///             MinBandwidthPercent = 10,
    ///             PercentSourceType = "InternetUpBandwidth",
    ///             Priority = 1,
    ///             QosId = defaultQos.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class QosCar : Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the QoS speed limiting rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The speed limiting method. Valid values: Absolute, Percent.
        /// </summary>
        [Output("limitType")]
        public Output<string> LimitType { get; private set; } = null!;

        /// <summary>
        /// The maximum bandwidth allowed for the stream specified in the quintuple rule. This parameter is required when the value of the LimitType is Absolute.
        /// </summary>
        [Output("maxBandwidthAbs")]
        public Output<int?> MaxBandwidthAbs { get; private set; } = null!;

        /// <summary>
        /// The maximum bandwidth percentage allowed for the stream specified in the quintuple rule. It is based on the maximum upstream bandwidth you set for the associated Smart Access Gateway (SAG) instance.This parameter is required when the value of the LimitType parameter is Percent.
        /// </summary>
        [Output("maxBandwidthPercent")]
        public Output<int?> MaxBandwidthPercent { get; private set; } = null!;

        /// <summary>
        /// The minimum bandwidth allowed for the stream specified in the quintuple rule. This parameter is required when the value of the LimitType parameter is Absolute.
        /// </summary>
        [Output("minBandwidthAbs")]
        public Output<int?> MinBandwidthAbs { get; private set; } = null!;

        /// <summary>
        /// The minimum bandwidth percentage allowed for the stream specified in the quintuple rule. It is based on the maximum upstream bandwidth you set for the associated SAG instance.This parameter is required when the value of the LimitType parameter is Percent.
        /// </summary>
        [Output("minBandwidthPercent")]
        public Output<int?> MinBandwidthPercent { get; private set; } = null!;

        /// <summary>
        /// The name of the QoS speed limiting rule..
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The bandwidth type when the speed is limited based on percentage. Valid values: CcnBandwidth, InternetUpBandwidth.The default value is InternetUpBandwidth.
        /// </summary>
        [Output("percentSourceType")]
        public Output<string?> PercentSourceType { get; private set; } = null!;

        /// <summary>
        /// The priority of the specified stream.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// The instance ID of the QoS.
        /// </summary>
        [Output("qosId")]
        public Output<string> QosId { get; private set; } = null!;


        /// <summary>
        /// Create a QosCar resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public QosCar(string name, QosCarArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/qosCar:QosCar", name, args ?? new QosCarArgs(), MakeResourceOptions(options, ""))
        {
        }

        private QosCar(string name, Input<string> id, QosCarState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/qosCar:QosCar", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing QosCar resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static QosCar Get(string name, Input<string> id, QosCarState? state = null, CustomResourceOptions? options = null)
        {
            return new QosCar(name, id, state, options);
        }
    }

    public sealed class QosCarArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the QoS speed limiting rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The speed limiting method. Valid values: Absolute, Percent.
        /// </summary>
        [Input("limitType", required: true)]
        public Input<string> LimitType { get; set; } = null!;

        /// <summary>
        /// The maximum bandwidth allowed for the stream specified in the quintuple rule. This parameter is required when the value of the LimitType is Absolute.
        /// </summary>
        [Input("maxBandwidthAbs")]
        public Input<int>? MaxBandwidthAbs { get; set; }

        /// <summary>
        /// The maximum bandwidth percentage allowed for the stream specified in the quintuple rule. It is based on the maximum upstream bandwidth you set for the associated Smart Access Gateway (SAG) instance.This parameter is required when the value of the LimitType parameter is Percent.
        /// </summary>
        [Input("maxBandwidthPercent")]
        public Input<int>? MaxBandwidthPercent { get; set; }

        /// <summary>
        /// The minimum bandwidth allowed for the stream specified in the quintuple rule. This parameter is required when the value of the LimitType parameter is Absolute.
        /// </summary>
        [Input("minBandwidthAbs")]
        public Input<int>? MinBandwidthAbs { get; set; }

        /// <summary>
        /// The minimum bandwidth percentage allowed for the stream specified in the quintuple rule. It is based on the maximum upstream bandwidth you set for the associated SAG instance.This parameter is required when the value of the LimitType parameter is Percent.
        /// </summary>
        [Input("minBandwidthPercent")]
        public Input<int>? MinBandwidthPercent { get; set; }

        /// <summary>
        /// The name of the QoS speed limiting rule..
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The bandwidth type when the speed is limited based on percentage. Valid values: CcnBandwidth, InternetUpBandwidth.The default value is InternetUpBandwidth.
        /// </summary>
        [Input("percentSourceType")]
        public Input<string>? PercentSourceType { get; set; }

        /// <summary>
        /// The priority of the specified stream.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        /// <summary>
        /// The instance ID of the QoS.
        /// </summary>
        [Input("qosId", required: true)]
        public Input<string> QosId { get; set; } = null!;

        public QosCarArgs()
        {
        }
    }

    public sealed class QosCarState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the QoS speed limiting rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The speed limiting method. Valid values: Absolute, Percent.
        /// </summary>
        [Input("limitType")]
        public Input<string>? LimitType { get; set; }

        /// <summary>
        /// The maximum bandwidth allowed for the stream specified in the quintuple rule. This parameter is required when the value of the LimitType is Absolute.
        /// </summary>
        [Input("maxBandwidthAbs")]
        public Input<int>? MaxBandwidthAbs { get; set; }

        /// <summary>
        /// The maximum bandwidth percentage allowed for the stream specified in the quintuple rule. It is based on the maximum upstream bandwidth you set for the associated Smart Access Gateway (SAG) instance.This parameter is required when the value of the LimitType parameter is Percent.
        /// </summary>
        [Input("maxBandwidthPercent")]
        public Input<int>? MaxBandwidthPercent { get; set; }

        /// <summary>
        /// The minimum bandwidth allowed for the stream specified in the quintuple rule. This parameter is required when the value of the LimitType parameter is Absolute.
        /// </summary>
        [Input("minBandwidthAbs")]
        public Input<int>? MinBandwidthAbs { get; set; }

        /// <summary>
        /// The minimum bandwidth percentage allowed for the stream specified in the quintuple rule. It is based on the maximum upstream bandwidth you set for the associated SAG instance.This parameter is required when the value of the LimitType parameter is Percent.
        /// </summary>
        [Input("minBandwidthPercent")]
        public Input<int>? MinBandwidthPercent { get; set; }

        /// <summary>
        /// The name of the QoS speed limiting rule..
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The bandwidth type when the speed is limited based on percentage. Valid values: CcnBandwidth, InternetUpBandwidth.The default value is InternetUpBandwidth.
        /// </summary>
        [Input("percentSourceType")]
        public Input<string>? PercentSourceType { get; set; }

        /// <summary>
        /// The priority of the specified stream.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The instance ID of the QoS.
        /// </summary>
        [Input("qosId")]
        public Input<string>? QosId { get; set; }

        public QosCarState()
        {
        }
    }
}
