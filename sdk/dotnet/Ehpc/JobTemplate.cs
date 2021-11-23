// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ehpc
{
    /// <summary>
    /// Provides a Ehpc Job Template resource.
    /// 
    /// For information about Ehpc Job Template and how to use it, see [What is Job Template](https://www.alibabacloud.com/help/product/57664.html).
    /// 
    /// &gt; **NOTE:** Available in v1.133.0+.
    /// 
    /// ## Example Usage
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
    ///         var @default = new AliCloud.Ehpc.JobTemplate("default", new AliCloud.Ehpc.JobTemplateArgs
    ///         {
    ///             CommandLine = "./LammpsTest/lammps.pbs",
    ///             JobTemplateName = "example_value",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Ehpc Job Template can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ehpc/jobTemplate:JobTemplate example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ehpc/jobTemplate:JobTemplate")]
    public partial class JobTemplate : Pulumi.CustomResource
    {
        /// <summary>
        /// Queue Jobs, Is of the Form: 1-10:2.
        /// </summary>
        [Output("arrayRequest")]
        public Output<string?> ArrayRequest { get; private set; } = null!;

        /// <summary>
        /// Job Maximum Run Time.
        /// </summary>
        [Output("clockTime")]
        public Output<string?> ClockTime { get; private set; } = null!;

        /// <summary>
        /// Job Commands.
        /// </summary>
        [Output("commandLine")]
        public Output<string> CommandLine { get; private set; } = null!;

        /// <summary>
        /// A Single Compute Node Using the GPU Number.Possible Values: 1~20000.
        /// </summary>
        [Output("gpu")]
        public Output<int?> Gpu { get; private set; } = null!;

        /// <summary>
        /// A Job Template Name.
        /// </summary>
        [Output("jobTemplateName")]
        public Output<string> JobTemplateName { get; private set; } = null!;

        /// <summary>
        /// A Single Compute Node Maximum Memory.
        /// </summary>
        [Output("mem")]
        public Output<string?> Mem { get; private set; } = null!;

        /// <summary>
        /// Submit a Task Is Required for Computing the Number of Data Nodes to Be. Possible Values: 1~5000 .
        /// </summary>
        [Output("node")]
        public Output<int?> Node { get; private set; } = null!;

        /// <summary>
        /// Job Commands the Directory.
        /// </summary>
        [Output("packagePath")]
        public Output<string?> PackagePath { get; private set; } = null!;

        /// <summary>
        /// The Job Priority.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// The Job Queue.
        /// </summary>
        [Output("queue")]
        public Output<string?> Queue { get; private set; } = null!;

        /// <summary>
        /// If the Job Is Support for the Re-Run.
        /// </summary>
        [Output("reRunable")]
        public Output<bool> ReRunable { get; private set; } = null!;

        /// <summary>
        /// The name of the user who performed the job.
        /// </summary>
        [Output("runasUser")]
        public Output<string?> RunasUser { get; private set; } = null!;

        /// <summary>
        /// Error Output Path.
        /// </summary>
        [Output("stderrRedirectPath")]
        public Output<string?> StderrRedirectPath { get; private set; } = null!;

        /// <summary>
        /// Standard Output Path and.
        /// </summary>
        [Output("stdoutRedirectPath")]
        public Output<string?> StdoutRedirectPath { get; private set; } = null!;

        /// <summary>
        /// A Single Compute Node Required Number of Tasks. Possible Values: 1~20000 .
        /// </summary>
        [Output("task")]
        public Output<int?> Task { get; private set; } = null!;

        /// <summary>
        /// A Single Task and the Number of Required Threads.
        /// </summary>
        [Output("thread")]
        public Output<int?> Thread { get; private set; } = null!;

        /// <summary>
        /// The Job of the Environment Variable.
        /// </summary>
        [Output("variables")]
        public Output<string?> Variables { get; private set; } = null!;


        /// <summary>
        /// Create a JobTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public JobTemplate(string name, JobTemplateArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ehpc/jobTemplate:JobTemplate", name, args ?? new JobTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private JobTemplate(string name, Input<string> id, JobTemplateState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ehpc/jobTemplate:JobTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing JobTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static JobTemplate Get(string name, Input<string> id, JobTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new JobTemplate(name, id, state, options);
        }
    }

    public sealed class JobTemplateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Queue Jobs, Is of the Form: 1-10:2.
        /// </summary>
        [Input("arrayRequest")]
        public Input<string>? ArrayRequest { get; set; }

        /// <summary>
        /// Job Maximum Run Time.
        /// </summary>
        [Input("clockTime")]
        public Input<string>? ClockTime { get; set; }

        /// <summary>
        /// Job Commands.
        /// </summary>
        [Input("commandLine", required: true)]
        public Input<string> CommandLine { get; set; } = null!;

        /// <summary>
        /// A Single Compute Node Using the GPU Number.Possible Values: 1~20000.
        /// </summary>
        [Input("gpu")]
        public Input<int>? Gpu { get; set; }

        /// <summary>
        /// A Job Template Name.
        /// </summary>
        [Input("jobTemplateName", required: true)]
        public Input<string> JobTemplateName { get; set; } = null!;

        /// <summary>
        /// A Single Compute Node Maximum Memory.
        /// </summary>
        [Input("mem")]
        public Input<string>? Mem { get; set; }

        /// <summary>
        /// Submit a Task Is Required for Computing the Number of Data Nodes to Be. Possible Values: 1~5000 .
        /// </summary>
        [Input("node")]
        public Input<int>? Node { get; set; }

        /// <summary>
        /// Job Commands the Directory.
        /// </summary>
        [Input("packagePath")]
        public Input<string>? PackagePath { get; set; }

        /// <summary>
        /// The Job Priority.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The Job Queue.
        /// </summary>
        [Input("queue")]
        public Input<string>? Queue { get; set; }

        /// <summary>
        /// If the Job Is Support for the Re-Run.
        /// </summary>
        [Input("reRunable")]
        public Input<bool>? ReRunable { get; set; }

        /// <summary>
        /// The name of the user who performed the job.
        /// </summary>
        [Input("runasUser")]
        public Input<string>? RunasUser { get; set; }

        /// <summary>
        /// Error Output Path.
        /// </summary>
        [Input("stderrRedirectPath")]
        public Input<string>? StderrRedirectPath { get; set; }

        /// <summary>
        /// Standard Output Path and.
        /// </summary>
        [Input("stdoutRedirectPath")]
        public Input<string>? StdoutRedirectPath { get; set; }

        /// <summary>
        /// A Single Compute Node Required Number of Tasks. Possible Values: 1~20000 .
        /// </summary>
        [Input("task")]
        public Input<int>? Task { get; set; }

        /// <summary>
        /// A Single Task and the Number of Required Threads.
        /// </summary>
        [Input("thread")]
        public Input<int>? Thread { get; set; }

        /// <summary>
        /// The Job of the Environment Variable.
        /// </summary>
        [Input("variables")]
        public Input<string>? Variables { get; set; }

        public JobTemplateArgs()
        {
        }
    }

    public sealed class JobTemplateState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Queue Jobs, Is of the Form: 1-10:2.
        /// </summary>
        [Input("arrayRequest")]
        public Input<string>? ArrayRequest { get; set; }

        /// <summary>
        /// Job Maximum Run Time.
        /// </summary>
        [Input("clockTime")]
        public Input<string>? ClockTime { get; set; }

        /// <summary>
        /// Job Commands.
        /// </summary>
        [Input("commandLine")]
        public Input<string>? CommandLine { get; set; }

        /// <summary>
        /// A Single Compute Node Using the GPU Number.Possible Values: 1~20000.
        /// </summary>
        [Input("gpu")]
        public Input<int>? Gpu { get; set; }

        /// <summary>
        /// A Job Template Name.
        /// </summary>
        [Input("jobTemplateName")]
        public Input<string>? JobTemplateName { get; set; }

        /// <summary>
        /// A Single Compute Node Maximum Memory.
        /// </summary>
        [Input("mem")]
        public Input<string>? Mem { get; set; }

        /// <summary>
        /// Submit a Task Is Required for Computing the Number of Data Nodes to Be. Possible Values: 1~5000 .
        /// </summary>
        [Input("node")]
        public Input<int>? Node { get; set; }

        /// <summary>
        /// Job Commands the Directory.
        /// </summary>
        [Input("packagePath")]
        public Input<string>? PackagePath { get; set; }

        /// <summary>
        /// The Job Priority.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The Job Queue.
        /// </summary>
        [Input("queue")]
        public Input<string>? Queue { get; set; }

        /// <summary>
        /// If the Job Is Support for the Re-Run.
        /// </summary>
        [Input("reRunable")]
        public Input<bool>? ReRunable { get; set; }

        /// <summary>
        /// The name of the user who performed the job.
        /// </summary>
        [Input("runasUser")]
        public Input<string>? RunasUser { get; set; }

        /// <summary>
        /// Error Output Path.
        /// </summary>
        [Input("stderrRedirectPath")]
        public Input<string>? StderrRedirectPath { get; set; }

        /// <summary>
        /// Standard Output Path and.
        /// </summary>
        [Input("stdoutRedirectPath")]
        public Input<string>? StdoutRedirectPath { get; set; }

        /// <summary>
        /// A Single Compute Node Required Number of Tasks. Possible Values: 1~20000 .
        /// </summary>
        [Input("task")]
        public Input<int>? Task { get; set; }

        /// <summary>
        /// A Single Task and the Number of Required Threads.
        /// </summary>
        [Input("thread")]
        public Input<int>? Thread { get; set; }

        /// <summary>
        /// The Job of the Environment Variable.
        /// </summary>
        [Input("variables")]
        public Input<string>? Variables { get; set; }

        public JobTemplateState()
        {
        }
    }
}