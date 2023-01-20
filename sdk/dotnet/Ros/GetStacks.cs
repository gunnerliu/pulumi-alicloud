// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros
{
    public static class GetStacks
    {
        /// <summary>
        /// This data source provides the Ros Stacks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.106.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.Ros.GetStacks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRosStackId"] = example.Apply(getStacksResult =&gt; getStacksResult.Stacks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetStacksResult> InvokeAsync(GetStacksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStacksResult>("alicloud:ros/getStacks:getStacks", args ?? new GetStacksArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ros Stacks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.106.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.Ros.GetStacks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRosStackId"] = example.Apply(getStacksResult =&gt; getStacksResult.Stacks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetStacksResult> Invoke(GetStacksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStacksResult>("alicloud:ros/getStacks:getStacks", args ?? new GetStacksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStacksArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Stack IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Stack name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Parent Stack Id.
        /// </summary>
        [Input("parentStackId")]
        public string? ParentStackId { get; set; }

        /// <summary>
        /// The show nested stack.
        /// </summary>
        [Input("showNestedStack")]
        public bool? ShowNestedStack { get; set; }

        /// <summary>
        /// Stack Name.
        /// </summary>
        [Input("stackName")]
        public string? StackName { get; set; }

        /// <summary>
        /// The status of Stack. Valid Values: `CREATE_COMPLETE`, `CREATE_FAILED`, `CREATE_IN_PROGRESS`, `DELETE_COMPLETE`, `DELETE_FAILED`, `DELETE_IN_PROGRESS`, `ROLLBACK_COMPLETE`, `ROLLBACK_FAILED`, `ROLLBACK_IN_PROGRESS`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetStacksArgs()
        {
        }
        public static new GetStacksArgs Empty => new GetStacksArgs();
    }

    public sealed class GetStacksInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Stack IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Stack name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Parent Stack Id.
        /// </summary>
        [Input("parentStackId")]
        public Input<string>? ParentStackId { get; set; }

        /// <summary>
        /// The show nested stack.
        /// </summary>
        [Input("showNestedStack")]
        public Input<bool>? ShowNestedStack { get; set; }

        /// <summary>
        /// Stack Name.
        /// </summary>
        [Input("stackName")]
        public Input<string>? StackName { get; set; }

        /// <summary>
        /// The status of Stack. Valid Values: `CREATE_COMPLETE`, `CREATE_FAILED`, `CREATE_IN_PROGRESS`, `DELETE_COMPLETE`, `DELETE_FAILED`, `DELETE_IN_PROGRESS`, `ROLLBACK_COMPLETE`, `ROLLBACK_FAILED`, `ROLLBACK_IN_PROGRESS`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public GetStacksInvokeArgs()
        {
        }
        public static new GetStacksInvokeArgs Empty => new GetStacksInvokeArgs();
    }


    [OutputType]
    public sealed class GetStacksResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ParentStackId;
        public readonly bool? ShowNestedStack;
        public readonly string? StackName;
        public readonly ImmutableArray<Outputs.GetStacksStackResult> Stacks;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetStacksResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? parentStackId,

            bool? showNestedStack,

            string? stackName,

            ImmutableArray<Outputs.GetStacksStackResult> stacks,

            string? status,

            ImmutableDictionary<string, object>? tags)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ParentStackId = parentStackId;
            ShowNestedStack = showNestedStack;
            StackName = stackName;
            Stacks = stacks;
            Status = status;
            Tags = tags;
        }
    }
}
