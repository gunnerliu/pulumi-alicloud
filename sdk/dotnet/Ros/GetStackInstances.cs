// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros
{
    public static class GetStackInstances
    {
        /// <summary>
        /// This data source provides the Ros Stack Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.145.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.Ros.GetStackInstances.InvokeAsync(new AliCloud.Ros.GetStackInstancesArgs
        ///         {
        ///             StackGroupName = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///             EnableDetails = true,
        ///         }));
        ///         this.RosStackInstanceId1 = ids.Apply(ids =&gt; ids.Instances?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Ros.GetStackInstances.InvokeAsync(new AliCloud.Ros.GetStackInstancesArgs
        ///         {
        ///             StackGroupName = "example_value",
        ///             Status = "CURRENT",
        ///             EnableDetails = true,
        ///         }));
        ///         this.RosStackInstanceId2 = status.Apply(status =&gt; status.Instances?[0]?.Id);
        ///         var regionId = Output.Create(AliCloud.Ros.GetStackInstances.InvokeAsync(new AliCloud.Ros.GetStackInstancesArgs
        ///         {
        ///             StackGroupName = "example_value",
        ///             StackInstanceRegionId = "example_value",
        ///             EnableDetails = true,
        ///         }));
        ///         this.RosStackInstanceId3 = regionId.Apply(regionId =&gt; regionId.Instances?[0]?.Id);
        ///         var accountId = Output.Create(AliCloud.Ros.GetStackInstances.InvokeAsync(new AliCloud.Ros.GetStackInstancesArgs
        ///         {
        ///             StackGroupName = "example_value",
        ///             StackInstanceAccountId = "example_value",
        ///             EnableDetails = true,
        ///         }));
        ///         this.RosStackInstanceId4 = accountId.Apply(accountId =&gt; accountId.Instances?[0]?.Id);
        ///     }
        /// 
        ///     [Output("rosStackInstanceId1")]
        ///     public Output&lt;string&gt; RosStackInstanceId1 { get; set; }
        ///     [Output("rosStackInstanceId2")]
        ///     public Output&lt;string&gt; RosStackInstanceId2 { get; set; }
        ///     [Output("rosStackInstanceId3")]
        ///     public Output&lt;string&gt; RosStackInstanceId3 { get; set; }
        ///     [Output("rosStackInstanceId4")]
        ///     public Output&lt;string&gt; RosStackInstanceId4 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetStackInstancesResult> InvokeAsync(GetStackInstancesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetStackInstancesResult>("alicloud:ros/getStackInstances:getStackInstances", args ?? new GetStackInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ros Stack Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.145.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.Ros.GetStackInstances.InvokeAsync(new AliCloud.Ros.GetStackInstancesArgs
        ///         {
        ///             StackGroupName = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///             EnableDetails = true,
        ///         }));
        ///         this.RosStackInstanceId1 = ids.Apply(ids =&gt; ids.Instances?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Ros.GetStackInstances.InvokeAsync(new AliCloud.Ros.GetStackInstancesArgs
        ///         {
        ///             StackGroupName = "example_value",
        ///             Status = "CURRENT",
        ///             EnableDetails = true,
        ///         }));
        ///         this.RosStackInstanceId2 = status.Apply(status =&gt; status.Instances?[0]?.Id);
        ///         var regionId = Output.Create(AliCloud.Ros.GetStackInstances.InvokeAsync(new AliCloud.Ros.GetStackInstancesArgs
        ///         {
        ///             StackGroupName = "example_value",
        ///             StackInstanceRegionId = "example_value",
        ///             EnableDetails = true,
        ///         }));
        ///         this.RosStackInstanceId3 = regionId.Apply(regionId =&gt; regionId.Instances?[0]?.Id);
        ///         var accountId = Output.Create(AliCloud.Ros.GetStackInstances.InvokeAsync(new AliCloud.Ros.GetStackInstancesArgs
        ///         {
        ///             StackGroupName = "example_value",
        ///             StackInstanceAccountId = "example_value",
        ///             EnableDetails = true,
        ///         }));
        ///         this.RosStackInstanceId4 = accountId.Apply(accountId =&gt; accountId.Instances?[0]?.Id);
        ///     }
        /// 
        ///     [Output("rosStackInstanceId1")]
        ///     public Output&lt;string&gt; RosStackInstanceId1 { get; set; }
        ///     [Output("rosStackInstanceId2")]
        ///     public Output&lt;string&gt; RosStackInstanceId2 { get; set; }
        ///     [Output("rosStackInstanceId3")]
        ///     public Output&lt;string&gt; RosStackInstanceId3 { get; set; }
        ///     [Output("rosStackInstanceId4")]
        ///     public Output&lt;string&gt; RosStackInstanceId4 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetStackInstancesResult> Invoke(GetStackInstancesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetStackInstancesResult>("alicloud:ros/getStackInstances:getStackInstances", args ?? new GetStackInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStackInstancesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Stack Instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of the stack group.
        /// </summary>
        [Input("stackGroupName", required: true)]
        public string StackGroupName { get; set; } = null!;

        /// <summary>
        /// The account to which the stack instance belongs.
        /// </summary>
        [Input("stackInstanceAccountId")]
        public string? StackInstanceAccountId { get; set; }

        /// <summary>
        /// The region of the stack instance.
        /// </summary>
        [Input("stackInstanceRegionId")]
        public string? StackInstanceRegionId { get; set; }

        /// <summary>
        /// The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`. 
        /// * `CURRENT`: The stack corresponding to the stack instance is up to date with the stack group.
        /// * `OUTDATED`: The stack corresponding to the stack instance is not up to date with the stack group. The `OUTDATED` state has the following possible causes:
        /// * When the CreateStackInstances operation is called to create stack instances, the corresponding stacks fail to be created.
        /// * When the UpdateStackInstances or UpdateStackGroup operation is called to update stack instances, the corresponding stacks fail to be updated, or only some of the stack instances are updated.
        /// * The create or update operation is not complete.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetStackInstancesArgs()
        {
        }
    }

    public sealed class GetStackInstancesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Stack Instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of the stack group.
        /// </summary>
        [Input("stackGroupName", required: true)]
        public Input<string> StackGroupName { get; set; } = null!;

        /// <summary>
        /// The account to which the stack instance belongs.
        /// </summary>
        [Input("stackInstanceAccountId")]
        public Input<string>? StackInstanceAccountId { get; set; }

        /// <summary>
        /// The region of the stack instance.
        /// </summary>
        [Input("stackInstanceRegionId")]
        public Input<string>? StackInstanceRegionId { get; set; }

        /// <summary>
        /// The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`. 
        /// * `CURRENT`: The stack corresponding to the stack instance is up to date with the stack group.
        /// * `OUTDATED`: The stack corresponding to the stack instance is not up to date with the stack group. The `OUTDATED` state has the following possible causes:
        /// * When the CreateStackInstances operation is called to create stack instances, the corresponding stacks fail to be created.
        /// * When the UpdateStackInstances or UpdateStackGroup operation is called to update stack instances, the corresponding stacks fail to be updated, or only some of the stack instances are updated.
        /// * The create or update operation is not complete.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetStackInstancesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetStackInstancesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetStackInstancesInstanceResult> Instances;
        public readonly string? OutputFile;
        public readonly string StackGroupName;
        public readonly string? StackInstanceAccountId;
        public readonly string? StackInstanceRegionId;
        public readonly string? Status;

        [OutputConstructor]
        private GetStackInstancesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetStackInstancesInstanceResult> instances,

            string? outputFile,

            string stackGroupName,

            string? stackInstanceAccountId,

            string? stackInstanceRegionId,

            string? status)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Instances = instances;
            OutputFile = outputFile;
            StackGroupName = stackGroupName;
            StackInstanceAccountId = stackInstanceAccountId;
            StackInstanceRegionId = stackInstanceRegionId;
            Status = status;
        }
    }
}
