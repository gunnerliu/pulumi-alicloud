// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC
{
    /// <summary>
    /// Provides a Alicloud Function Compute Function resource. Function allows you to trigger execution of code in response to events in Alibaba Cloud. The Function itself includes source code and runtime configuration.
    ///  For information about Service and how to use it, see [What is Function Compute](https://www.alibabacloud.com/help/doc-detail/52895.htm).
    /// 
    /// &gt; **NOTE:** The resource requires a provider field 'account_id'. See account_id.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "alicloudfcfunctionconfig";
    ///     var defaultProject = new AliCloud.Log.Project("defaultProject", new()
    ///     {
    ///         Description = "tf unit test",
    ///     });
    /// 
    ///     var defaultStore = new AliCloud.Log.Store("defaultStore", new()
    ///     {
    ///         Project = defaultProject.Name,
    ///         RetentionPeriod = 3000,
    ///         ShardCount = 1,
    ///     });
    /// 
    ///     var defaultRole = new AliCloud.Ram.Role("defaultRole", new()
    ///     {
    ///         Document = @"        {
    ///           ""Statement"": [
    ///             {
    ///               ""Action"": ""sts:AssumeRole"",
    ///               ""Effect"": ""Allow"",
    ///               ""Principal"": {
    ///                 ""Service"": [
    ///                   ""fc.aliyuncs.com""
    ///                 ]
    ///               }
    ///             }
    ///           ],
    ///           ""Version"": ""1""
    ///         }
    ///     
    /// ",
    ///         Description = "this is a test",
    ///         Force = true,
    ///     });
    /// 
    ///     var defaultRolePolicyAttachment = new AliCloud.Ram.RolePolicyAttachment("defaultRolePolicyAttachment", new()
    ///     {
    ///         RoleName = defaultRole.Name,
    ///         PolicyName = "AliyunLogFullAccess",
    ///         PolicyType = "System",
    ///     });
    /// 
    ///     var defaultService = new AliCloud.FC.Service("defaultService", new()
    ///     {
    ///         Description = "tf unit test",
    ///         LogConfig = new AliCloud.FC.Inputs.ServiceLogConfigArgs
    ///         {
    ///             Project = defaultProject.Name,
    ///             Logstore = defaultStore.Name,
    ///         },
    ///         Role = defaultRole.Arn,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             defaultRolePolicyAttachment,
    ///         },
    ///     });
    /// 
    ///     var defaultBucket = new AliCloud.Oss.Bucket("defaultBucket", new()
    ///     {
    ///         BucketName = name,
    ///     });
    /// 
    ///     // If you upload the function by OSS Bucket, you need to specify path can't upload by content.
    ///     var defaultBucketObject = new AliCloud.Oss.BucketObject("defaultBucketObject", new()
    ///     {
    ///         Bucket = defaultBucket.Id,
    ///         Key = "fc/hello.zip",
    ///         Source = "./hello.zip",
    ///     });
    /// 
    ///     var foo = new AliCloud.FC.Function("foo", new()
    ///     {
    ///         Service = defaultService.Name,
    ///         Description = "tf",
    ///         OssBucket = defaultBucket.Id,
    ///         OssKey = defaultBucketObject.Key,
    ///         MemorySize = 512,
    ///         Runtime = "python2.7",
    ///         Handler = "hello.handler",
    ///         EnvironmentVariables = 
    ///         {
    ///             { "prefix", "terraform" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Module Support
    /// 
    /// You can use to the existing fc module
    /// to create a function quickly and set several triggers for it.
    /// 
    /// ## Import
    /// 
    /// Function Compute function can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:fc/function:Function foo my-fc-service:hello-world
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:fc/function:Function")]
    public partial class Function : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
        /// </summary>
        [Output("caPort")]
        public Output<int?> CaPort { get; private set; } = null!;

        /// <summary>
        /// The checksum (crc64) of the function code.Used to trigger updates.The value can be generated by data source alicloud_file_crc64_checksum.
        /// &gt; **NOTE:** For more information, see [Limits](https://www.alibabacloud.com/help/doc-detail/51907.htm).
        /// </summary>
        [Output("codeChecksum")]
        public Output<string> CodeChecksum { get; private set; } = null!;

        /// <summary>
        /// The configuration for custom container runtime.
        /// </summary>
        [Output("customContainerConfig")]
        public Output<Outputs.FunctionCustomContainerConfig?> CustomContainerConfig { get; private set; } = null!;

        /// <summary>
        /// The Function Compute function description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A map that defines environment variables for the function.
        /// </summary>
        [Output("environmentVariables")]
        public Output<ImmutableDictionary<string, object>?> EnvironmentVariables { get; private set; } = null!;

        /// <summary>
        /// The path to the function's deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
        /// </summary>
        [Output("filename")]
        public Output<string?> Filename { get; private set; } = null!;

        /// <summary>
        /// The Function Compute service ID.
        /// </summary>
        [Output("functionId")]
        public Output<string> FunctionId { get; private set; } = null!;

        /// <summary>
        /// The function [entry point](https://www.alibabacloud.com/help/doc-detail/157704.htm) in your code.
        /// </summary>
        [Output("handler")]
        public Output<string> Handler { get; private set; } = null!;

        /// <summary>
        /// The maximum length of time, in seconds, that the function's initialization should be run for.
        /// </summary>
        [Output("initializationTimeout")]
        public Output<int?> InitializationTimeout { get; private set; } = null!;

        /// <summary>
        /// The entry point of the function's [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
        /// </summary>
        [Output("initializer")]
        public Output<string?> Initializer { get; private set; } = null!;

        /// <summary>
        /// The maximum number of requests can be executed concurrently within the single function instance.
        /// </summary>
        [Output("instanceConcurrency")]
        public Output<int?> InstanceConcurrency { get; private set; } = null!;

        /// <summary>
        /// The instance type of the function.
        /// </summary>
        [Output("instanceType")]
        public Output<string?> InstanceType { get; private set; } = null!;

        /// <summary>
        /// The date this resource was last modified.
        /// </summary>
        [Output("lastModified")]
        public Output<string> LastModified { get; private set; } = null!;

        /// <summary>
        /// The configuration for layers.
        /// </summary>
        [Output("layers")]
        public Output<ImmutableArray<string>> Layers { get; private set; } = null!;

        /// <summary>
        /// Amount of memory in MB your function can use at runtime. Defaults to `128`. Limits to [128, 32768].
        /// </summary>
        [Output("memorySize")]
        public Output<int?> MemorySize { get; private set; } = null!;

        /// <summary>
        /// The Function Compute function name. It is the only in one service and is conflict with "name_prefix".
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Setting a prefix to get a only function name. It is conflict with "name".
        /// </summary>
        [Output("namePrefix")]
        public Output<string?> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// The OSS bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
        /// </summary>
        [Output("ossBucket")]
        public Output<string?> OssBucket { get; private set; } = null!;

        /// <summary>
        /// The OSS key of an object containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Output("ossKey")]
        public Output<string?> OssKey { get; private set; } = null!;

        /// <summary>
        /// See [Runtimes][https://www.alibabacloud.com/help/zh/function-compute/latest/manage-functions#multiTask3514] for valid values.
        /// </summary>
        [Output("runtime")]
        public Output<string> Runtime { get; private set; } = null!;

        /// <summary>
        /// The Function Compute service name.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;

        /// <summary>
        /// The amount of time your function has to run in seconds.
        /// </summary>
        [Output("timeout")]
        public Output<int?> Timeout { get; private set; } = null!;


        /// <summary>
        /// Create a Function resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Function(string name, FunctionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:fc/function:Function", name, args ?? new FunctionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Function(string name, Input<string> id, FunctionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:fc/function:Function", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Function resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Function Get(string name, Input<string> id, FunctionState? state = null, CustomResourceOptions? options = null)
        {
            return new Function(name, id, state, options);
        }
    }

    public sealed class FunctionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
        /// </summary>
        [Input("caPort")]
        public Input<int>? CaPort { get; set; }

        /// <summary>
        /// The checksum (crc64) of the function code.Used to trigger updates.The value can be generated by data source alicloud_file_crc64_checksum.
        /// &gt; **NOTE:** For more information, see [Limits](https://www.alibabacloud.com/help/doc-detail/51907.htm).
        /// </summary>
        [Input("codeChecksum")]
        public Input<string>? CodeChecksum { get; set; }

        /// <summary>
        /// The configuration for custom container runtime.
        /// </summary>
        [Input("customContainerConfig")]
        public Input<Inputs.FunctionCustomContainerConfigArgs>? CustomContainerConfig { get; set; }

        /// <summary>
        /// The Function Compute function description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("environmentVariables")]
        private InputMap<object>? _environmentVariables;

        /// <summary>
        /// A map that defines environment variables for the function.
        /// </summary>
        public InputMap<object> EnvironmentVariables
        {
            get => _environmentVariables ?? (_environmentVariables = new InputMap<object>());
            set => _environmentVariables = value;
        }

        /// <summary>
        /// The path to the function's deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        /// <summary>
        /// The function [entry point](https://www.alibabacloud.com/help/doc-detail/157704.htm) in your code.
        /// </summary>
        [Input("handler", required: true)]
        public Input<string> Handler { get; set; } = null!;

        /// <summary>
        /// The maximum length of time, in seconds, that the function's initialization should be run for.
        /// </summary>
        [Input("initializationTimeout")]
        public Input<int>? InitializationTimeout { get; set; }

        /// <summary>
        /// The entry point of the function's [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
        /// </summary>
        [Input("initializer")]
        public Input<string>? Initializer { get; set; }

        /// <summary>
        /// The maximum number of requests can be executed concurrently within the single function instance.
        /// </summary>
        [Input("instanceConcurrency")]
        public Input<int>? InstanceConcurrency { get; set; }

        /// <summary>
        /// The instance type of the function.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("layers")]
        private InputList<string>? _layers;

        /// <summary>
        /// The configuration for layers.
        /// </summary>
        public InputList<string> Layers
        {
            get => _layers ?? (_layers = new InputList<string>());
            set => _layers = value;
        }

        /// <summary>
        /// Amount of memory in MB your function can use at runtime. Defaults to `128`. Limits to [128, 32768].
        /// </summary>
        [Input("memorySize")]
        public Input<int>? MemorySize { get; set; }

        /// <summary>
        /// The Function Compute function name. It is the only in one service and is conflict with "name_prefix".
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Setting a prefix to get a only function name. It is conflict with "name".
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// The OSS bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
        /// </summary>
        [Input("ossBucket")]
        public Input<string>? OssBucket { get; set; }

        /// <summary>
        /// The OSS key of an object containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Input("ossKey")]
        public Input<string>? OssKey { get; set; }

        /// <summary>
        /// See [Runtimes][https://www.alibabacloud.com/help/zh/function-compute/latest/manage-functions#multiTask3514] for valid values.
        /// </summary>
        [Input("runtime", required: true)]
        public Input<string> Runtime { get; set; } = null!;

        /// <summary>
        /// The Function Compute service name.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        /// <summary>
        /// The amount of time your function has to run in seconds.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public FunctionArgs()
        {
        }
        public static new FunctionArgs Empty => new FunctionArgs();
    }

    public sealed class FunctionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
        /// </summary>
        [Input("caPort")]
        public Input<int>? CaPort { get; set; }

        /// <summary>
        /// The checksum (crc64) of the function code.Used to trigger updates.The value can be generated by data source alicloud_file_crc64_checksum.
        /// &gt; **NOTE:** For more information, see [Limits](https://www.alibabacloud.com/help/doc-detail/51907.htm).
        /// </summary>
        [Input("codeChecksum")]
        public Input<string>? CodeChecksum { get; set; }

        /// <summary>
        /// The configuration for custom container runtime.
        /// </summary>
        [Input("customContainerConfig")]
        public Input<Inputs.FunctionCustomContainerConfigGetArgs>? CustomContainerConfig { get; set; }

        /// <summary>
        /// The Function Compute function description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("environmentVariables")]
        private InputMap<object>? _environmentVariables;

        /// <summary>
        /// A map that defines environment variables for the function.
        /// </summary>
        public InputMap<object> EnvironmentVariables
        {
            get => _environmentVariables ?? (_environmentVariables = new InputMap<object>());
            set => _environmentVariables = value;
        }

        /// <summary>
        /// The path to the function's deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        /// <summary>
        /// The Function Compute service ID.
        /// </summary>
        [Input("functionId")]
        public Input<string>? FunctionId { get; set; }

        /// <summary>
        /// The function [entry point](https://www.alibabacloud.com/help/doc-detail/157704.htm) in your code.
        /// </summary>
        [Input("handler")]
        public Input<string>? Handler { get; set; }

        /// <summary>
        /// The maximum length of time, in seconds, that the function's initialization should be run for.
        /// </summary>
        [Input("initializationTimeout")]
        public Input<int>? InitializationTimeout { get; set; }

        /// <summary>
        /// The entry point of the function's [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
        /// </summary>
        [Input("initializer")]
        public Input<string>? Initializer { get; set; }

        /// <summary>
        /// The maximum number of requests can be executed concurrently within the single function instance.
        /// </summary>
        [Input("instanceConcurrency")]
        public Input<int>? InstanceConcurrency { get; set; }

        /// <summary>
        /// The instance type of the function.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The date this resource was last modified.
        /// </summary>
        [Input("lastModified")]
        public Input<string>? LastModified { get; set; }

        [Input("layers")]
        private InputList<string>? _layers;

        /// <summary>
        /// The configuration for layers.
        /// </summary>
        public InputList<string> Layers
        {
            get => _layers ?? (_layers = new InputList<string>());
            set => _layers = value;
        }

        /// <summary>
        /// Amount of memory in MB your function can use at runtime. Defaults to `128`. Limits to [128, 32768].
        /// </summary>
        [Input("memorySize")]
        public Input<int>? MemorySize { get; set; }

        /// <summary>
        /// The Function Compute function name. It is the only in one service and is conflict with "name_prefix".
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Setting a prefix to get a only function name. It is conflict with "name".
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// The OSS bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
        /// </summary>
        [Input("ossBucket")]
        public Input<string>? OssBucket { get; set; }

        /// <summary>
        /// The OSS key of an object containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Input("ossKey")]
        public Input<string>? OssKey { get; set; }

        /// <summary>
        /// See [Runtimes][https://www.alibabacloud.com/help/zh/function-compute/latest/manage-functions#multiTask3514] for valid values.
        /// </summary>
        [Input("runtime")]
        public Input<string>? Runtime { get; set; }

        /// <summary>
        /// The Function Compute service name.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        /// <summary>
        /// The amount of time your function has to run in seconds.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public FunctionState()
        {
        }
        public static new FunctionState Empty => new FunctionState();
    }
}
