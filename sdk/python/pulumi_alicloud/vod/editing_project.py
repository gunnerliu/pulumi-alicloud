# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EditingProjectArgs', 'EditingProject']

@pulumi.input_type
class EditingProjectArgs:
    def __init__(__self__, *,
                 title: pulumi.Input[str],
                 cover_url: Optional[pulumi.Input[str]] = None,
                 division: Optional[pulumi.Input[str]] = None,
                 editing_project_name: Optional[pulumi.Input[str]] = None,
                 timeline: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EditingProject resource.
        :param pulumi.Input[str] title: The title of the online editing project.
        :param pulumi.Input[str] cover_url: The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.
        :param pulumi.Input[str] division: The region where you want to create the online editing project.
        :param pulumi.Input[str] editing_project_name: The description of the online editing project.
        :param pulumi.Input[str] timeline: The timeline of the online editing project, in JSON format. For more information about the structure, see [Timeline](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/basic-structures). If you do not specify this parameter, an empty timeline is created and the duration of the online editing project is zero.
        """
        pulumi.set(__self__, "title", title)
        if cover_url is not None:
            pulumi.set(__self__, "cover_url", cover_url)
        if division is not None:
            pulumi.set(__self__, "division", division)
        if editing_project_name is not None:
            pulumi.set(__self__, "editing_project_name", editing_project_name)
        if timeline is not None:
            pulumi.set(__self__, "timeline", timeline)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        The title of the online editing project.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter(name="coverUrl")
    def cover_url(self) -> Optional[pulumi.Input[str]]:
        """
        The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.
        """
        return pulumi.get(self, "cover_url")

    @cover_url.setter
    def cover_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cover_url", value)

    @property
    @pulumi.getter
    def division(self) -> Optional[pulumi.Input[str]]:
        """
        The region where you want to create the online editing project.
        """
        return pulumi.get(self, "division")

    @division.setter
    def division(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "division", value)

    @property
    @pulumi.getter(name="editingProjectName")
    def editing_project_name(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the online editing project.
        """
        return pulumi.get(self, "editing_project_name")

    @editing_project_name.setter
    def editing_project_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "editing_project_name", value)

    @property
    @pulumi.getter
    def timeline(self) -> Optional[pulumi.Input[str]]:
        """
        The timeline of the online editing project, in JSON format. For more information about the structure, see [Timeline](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/basic-structures). If you do not specify this parameter, an empty timeline is created and the duration of the online editing project is zero.
        """
        return pulumi.get(self, "timeline")

    @timeline.setter
    def timeline(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timeline", value)


@pulumi.input_type
class _EditingProjectState:
    def __init__(__self__, *,
                 cover_url: Optional[pulumi.Input[str]] = None,
                 division: Optional[pulumi.Input[str]] = None,
                 editing_project_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 timeline: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EditingProject resources.
        :param pulumi.Input[str] cover_url: The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.
        :param pulumi.Input[str] division: The region where you want to create the online editing project.
        :param pulumi.Input[str] editing_project_name: The description of the online editing project.
        :param pulumi.Input[str] status: The Status of the resource.
        :param pulumi.Input[str] timeline: The timeline of the online editing project, in JSON format. For more information about the structure, see [Timeline](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/basic-structures). If you do not specify this parameter, an empty timeline is created and the duration of the online editing project is zero.
        :param pulumi.Input[str] title: The title of the online editing project.
        """
        if cover_url is not None:
            pulumi.set(__self__, "cover_url", cover_url)
        if division is not None:
            pulumi.set(__self__, "division", division)
        if editing_project_name is not None:
            pulumi.set(__self__, "editing_project_name", editing_project_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if timeline is not None:
            pulumi.set(__self__, "timeline", timeline)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter(name="coverUrl")
    def cover_url(self) -> Optional[pulumi.Input[str]]:
        """
        The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.
        """
        return pulumi.get(self, "cover_url")

    @cover_url.setter
    def cover_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cover_url", value)

    @property
    @pulumi.getter
    def division(self) -> Optional[pulumi.Input[str]]:
        """
        The region where you want to create the online editing project.
        """
        return pulumi.get(self, "division")

    @division.setter
    def division(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "division", value)

    @property
    @pulumi.getter(name="editingProjectName")
    def editing_project_name(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the online editing project.
        """
        return pulumi.get(self, "editing_project_name")

    @editing_project_name.setter
    def editing_project_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "editing_project_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The Status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def timeline(self) -> Optional[pulumi.Input[str]]:
        """
        The timeline of the online editing project, in JSON format. For more information about the structure, see [Timeline](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/basic-structures). If you do not specify this parameter, an empty timeline is created and the duration of the online editing project is zero.
        """
        return pulumi.get(self, "timeline")

    @timeline.setter
    def timeline(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timeline", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        The title of the online editing project.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)


class EditingProject(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cover_url: Optional[pulumi.Input[str]] = None,
                 division: Optional[pulumi.Input[str]] = None,
                 editing_project_name: Optional[pulumi.Input[str]] = None,
                 timeline: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a VOD Editing Project resource.

        For information about VOD Editing Project and how to use it, see [What is Editing Project](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/addeditingproject#doc-api-vod-AddEditingProject).

        > **NOTE:** Available since v1.187.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tfexample"
        default = alicloud.get_regions(current=True)
        example = alicloud.vod.EditingProject("example",
            editing_project_name=name,
            title=name,
            timeline=\"\"\"  {
            "VideoTracks":[
              {
                "VideoTrackClips":[
                  {
                  "MediaId":"0c60e6f02dae71edbfaa472190a90102",
                  "In":2811
                  }
                ]
              }
            ]
          }
        \"\"\",
            cover_url="https://demo.aliyundoc.com/6AB4D0E1E1C74468883516C2349D1FC2-6-2.png",
            division=default.regions[0].id)
        ```

        ## Import

        VOD Editing Project can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vod/editingProject:EditingProject example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cover_url: The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.
        :param pulumi.Input[str] division: The region where you want to create the online editing project.
        :param pulumi.Input[str] editing_project_name: The description of the online editing project.
        :param pulumi.Input[str] timeline: The timeline of the online editing project, in JSON format. For more information about the structure, see [Timeline](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/basic-structures). If you do not specify this parameter, an empty timeline is created and the duration of the online editing project is zero.
        :param pulumi.Input[str] title: The title of the online editing project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EditingProjectArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VOD Editing Project resource.

        For information about VOD Editing Project and how to use it, see [What is Editing Project](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/addeditingproject#doc-api-vod-AddEditingProject).

        > **NOTE:** Available since v1.187.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tfexample"
        default = alicloud.get_regions(current=True)
        example = alicloud.vod.EditingProject("example",
            editing_project_name=name,
            title=name,
            timeline=\"\"\"  {
            "VideoTracks":[
              {
                "VideoTrackClips":[
                  {
                  "MediaId":"0c60e6f02dae71edbfaa472190a90102",
                  "In":2811
                  }
                ]
              }
            ]
          }
        \"\"\",
            cover_url="https://demo.aliyundoc.com/6AB4D0E1E1C74468883516C2349D1FC2-6-2.png",
            division=default.regions[0].id)
        ```

        ## Import

        VOD Editing Project can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vod/editingProject:EditingProject example <id>
        ```

        :param str resource_name: The name of the resource.
        :param EditingProjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EditingProjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cover_url: Optional[pulumi.Input[str]] = None,
                 division: Optional[pulumi.Input[str]] = None,
                 editing_project_name: Optional[pulumi.Input[str]] = None,
                 timeline: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EditingProjectArgs.__new__(EditingProjectArgs)

            __props__.__dict__["cover_url"] = cover_url
            __props__.__dict__["division"] = division
            __props__.__dict__["editing_project_name"] = editing_project_name
            __props__.__dict__["timeline"] = timeline
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            __props__.__dict__["status"] = None
        super(EditingProject, __self__).__init__(
            'alicloud:vod/editingProject:EditingProject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cover_url: Optional[pulumi.Input[str]] = None,
            division: Optional[pulumi.Input[str]] = None,
            editing_project_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            timeline: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None) -> 'EditingProject':
        """
        Get an existing EditingProject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cover_url: The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.
        :param pulumi.Input[str] division: The region where you want to create the online editing project.
        :param pulumi.Input[str] editing_project_name: The description of the online editing project.
        :param pulumi.Input[str] status: The Status of the resource.
        :param pulumi.Input[str] timeline: The timeline of the online editing project, in JSON format. For more information about the structure, see [Timeline](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/basic-structures). If you do not specify this parameter, an empty timeline is created and the duration of the online editing project is zero.
        :param pulumi.Input[str] title: The title of the online editing project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EditingProjectState.__new__(_EditingProjectState)

        __props__.__dict__["cover_url"] = cover_url
        __props__.__dict__["division"] = division
        __props__.__dict__["editing_project_name"] = editing_project_name
        __props__.__dict__["status"] = status
        __props__.__dict__["timeline"] = timeline
        __props__.__dict__["title"] = title
        return EditingProject(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="coverUrl")
    def cover_url(self) -> pulumi.Output[Optional[str]]:
        """
        The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.
        """
        return pulumi.get(self, "cover_url")

    @property
    @pulumi.getter
    def division(self) -> pulumi.Output[Optional[str]]:
        """
        The region where you want to create the online editing project.
        """
        return pulumi.get(self, "division")

    @property
    @pulumi.getter(name="editingProjectName")
    def editing_project_name(self) -> pulumi.Output[str]:
        """
        The description of the online editing project.
        """
        return pulumi.get(self, "editing_project_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The Status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def timeline(self) -> pulumi.Output[str]:
        """
        The timeline of the online editing project, in JSON format. For more information about the structure, see [Timeline](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/basic-structures). If you do not specify this parameter, an empty timeline is created and the duration of the online editing project is zero.
        """
        return pulumi.get(self, "timeline")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        The title of the online editing project.
        """
        return pulumi.get(self, "title")

