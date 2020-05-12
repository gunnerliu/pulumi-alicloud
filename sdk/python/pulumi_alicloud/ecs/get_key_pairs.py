# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetKeyPairsResult:
    """
    A collection of values returned by getKeyPairs.
    """
    def __init__(__self__, finger_print=None, id=None, ids=None, key_pairs=None, name_regex=None, names=None, output_file=None, resource_group_id=None, tags=None):
        if finger_print and not isinstance(finger_print, bool):
            raise TypeError("Expected argument 'finger_print' to be a bool")
        __self__.finger_print = finger_print
        """
        Finger print of the key pair.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        __self__.ids = ids
        if key_pairs and not isinstance(key_pairs, list):
            raise TypeError("Expected argument 'key_pairs' to be a list")
        __self__.key_pairs = key_pairs
        """
        A list of key pairs. Each element contains the following attributes:
        """
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        __self__.name_regex = name_regex
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        __self__.names = names
        """
        A list of key pair names.
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        __self__.resource_group_id = resource_group_id
        """
        The Id of resource group.
        """
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        __self__.tags = tags
        """
        (Optional, Available in v1.66.0+) A mapping of tags to assign to the resource.
        """
class AwaitableGetKeyPairsResult(GetKeyPairsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKeyPairsResult(
            finger_print=self.finger_print,
            id=self.id,
            ids=self.ids,
            key_pairs=self.key_pairs,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            resource_group_id=self.resource_group_id,
            tags=self.tags)

def get_key_pairs(finger_print=None,ids=None,name_regex=None,output_file=None,resource_group_id=None,tags=None,opts=None):
    """
    This data source provides a list of key pairs in an Alibaba Cloud account according to the specified filters.

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    # Declare the data source
    default_key_pair = alicloud.ecs.KeyPair("defaultKeyPair", key_name="keyPairDatasource")
    default_key_pairs = default_key_pair.key_name.apply(lambda key_name: alicloud.ecs.get_key_pairs(name_regex=key_name))
    ```



    :param bool finger_print: A finger print used to retrieve specified key pair.
    :param list ids: A list of key pair IDs.
    :param str name_regex: A regex string to apply to the resulting key pairs.
    :param str resource_group_id: The Id of resource group which the key pair belongs.
    :param dict tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()


    __args__['fingerPrint'] = finger_print
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ecs/getKeyPairs:getKeyPairs', __args__, opts=opts).value

    return AwaitableGetKeyPairsResult(
        finger_print=__ret__.get('fingerPrint'),
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        key_pairs=__ret__.get('keyPairs'),
        name_regex=__ret__.get('nameRegex'),
        names=__ret__.get('names'),
        output_file=__ret__.get('outputFile'),
        resource_group_id=__ret__.get('resourceGroupId'),
        tags=__ret__.get('tags'))
